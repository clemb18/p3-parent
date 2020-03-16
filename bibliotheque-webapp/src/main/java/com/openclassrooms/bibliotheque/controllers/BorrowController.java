package com.openclassrooms.bibliotheque.controllers;

import com.openclassrooms.bibliotheque.models.Borrow;
import com.openclassrooms.bibliotheque.service.BorrowService;
import com.openclassrooms.bibliotheque.service.MemberService;
import com.openclassrooms.bibliotheque.utils.DateUtils;
import com.openclassrooms.bibliotheque.ws.BorrowWs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@Controller
public class BorrowController {
    private static Logger LOGGER = LoggerFactory.getLogger(BorrowController.class);

    public static final String WORK = "WORK";
    public static final String MEMBER = "MEMBER";

    @Autowired
    private MemberService memberService;
    @Autowired
    private BorrowService borrowService;

    // test emprunt sans recherche de membre
    @GetMapping("/borrow/{workId}")
    public String toBorrow(Model model, HttpSession session, @PathVariable Long workId)  {



        boolean borrowWs = borrowService.borrowBook(workId, Long.valueOf(String.valueOf(session.getAttribute("memberCoId"))));

        model.addAttribute("borrow" , borrowWs);

        //model.addAttribute("findResult", true);

      //  model.addAttribute("message", "L'emprunt à été validé avec succès !");
        // retourne la jsp
        return "redirect:/borrowSuccess";

    }

    // Menu => renvoie sur la page de recherche de membre
    @GetMapping("/searchMemberBorrow")
    public String searchMemberBorrowForm(Model model, HttpSession session) {
        List<BorrowWs> borrowListMember = borrowService.findBorrowListByMemberId(Long.valueOf(String.valueOf(session.getAttribute("memberCoId"))));
        List<Borrow> borrows = new ArrayList<>();
        for (BorrowWs borrowWs : borrowListMember) {
            Borrow borrow = new Borrow();
            BeanUtils.copyProperties(borrowWs, borrow);
            borrow.setEndBorrowDate(DateUtils.formatDate(borrowWs.getEndBorrowDate()));
            borrow.setStartBorrowDate(DateUtils.formatDate(borrowWs.getStartBorrowDate()));
            borrows.add(borrow);
            }

        model.addAttribute("findMemberResult", true);

        model.addAttribute("findResult", true);

        model.addAttribute("borrowList" , borrows);

        return "borrowListPage";
    }


    // prolonger l'emprunt
    @GetMapping("/extendBorrow/{borrowId}")
    public String extendBorrow(Model model, HttpSession session, @PathVariable int borrowId)  {

        boolean borrowExtend = borrowService.extendBorrow(Long.valueOf(borrowId));

        model.addAttribute("findResult", true);

        model.addAttribute("borrowExtend" , borrowExtend);

        model.addAttribute("message", "L'emprunt à été prolongé avec succès !");
        // retourne la jsp
        return "redirect:/extendSuccess";

    }

    // Cloturer l'emprunt
    @GetMapping("/endBorrow/{borrowId}")
    public String endBorrow(Model model, HttpSession session, @PathVariable int borrowId)  {

        boolean borrowEnd = borrowService.terminateBorrow(Long.valueOf(borrowId));

        model.addAttribute("findResult", true);

        model.addAttribute("borrowEnd" , borrowEnd);

        model.addAttribute("message", "L'emprunt à été cloturé avec succès !");

        // retourne la jsp

        return "redirect:/endSuccess";
    }

}
