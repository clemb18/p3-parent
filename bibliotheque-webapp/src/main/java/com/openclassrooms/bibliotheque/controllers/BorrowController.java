package com.openclassrooms.bibliotheque.controllers;

import com.openclassrooms.bibliotheque.service.BorrowService;
import com.openclassrooms.bibliotheque.service.MemberService;
import com.openclassrooms.bibliotheque.ws.BorrowWs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;
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
    public String searchMemberForm(Model model, HttpSession session, @PathVariable Long workId)  {

        BorrowWs  borrowWs = borrowService.borrowBook(workId, Long.valueOf(String.valueOf(session.getAttribute("memberCoId"))));

        // retourne la jsp
        return "finalBorrow";
    }


    @GetMapping("/borrow/selectMember/{memberFindId}")
    public String finalBorrowForm(Model model, HttpSession session, @PathVariable int memberFindId)  {


        Long workId = Long.valueOf(String.valueOf(session.getAttribute("workToBorrow")));

        BorrowWs  borrowWs = borrowService.borrowBook(workId, Long.valueOf(memberFindId));

        // retourne la jsp
        return "finalBorrow";
    }

    // Menu => renvoie sur la page de recherche de membre
    @GetMapping("/searchMemberBorrow")
    public String searchMemberBorrowForm(Model model, HttpSession session) {
        List<BorrowWs> borrowListMember = borrowService.findBorrowListByMemberId(Long.valueOf(String.valueOf(session.getAttribute("memberCoId"))));

        model.addAttribute("findMemberResult", true);


        model.addAttribute("findResult", true);

        model.addAttribute("borrowList" , borrowListMember);


        return "borrowListPage";
    }


    // prolonger l'emprunt
    @GetMapping("/extendBorrow/{borrowId}")
    public String extendBorrow(Model model, HttpSession session, @PathVariable int borrowId)  {

        boolean borrowExtend = borrowService.extendBorrow(Long.valueOf(borrowId));

        model.addAttribute("findResult", true);

        model.addAttribute("borrowExtend" , borrowExtend);

        // retourne la jsp
        return "extendBorrow";
    }

    // Cloturer l'emprunt
    @GetMapping("/endBorrow/{borrowId}")
    public String endBorrow(Model model, HttpSession session, @PathVariable int borrowId)  {

        boolean borrowEnd = borrowService.terminateBorrow(Long.valueOf(borrowId));

        model.addAttribute("findResult", true);

        model.addAttribute("borrowEnd" , borrowEnd);

        // retourne la jsp
        return "endBorrow";
    }

}
