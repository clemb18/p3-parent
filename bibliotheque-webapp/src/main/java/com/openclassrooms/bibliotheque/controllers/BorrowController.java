package com.openclassrooms.bibliotheque.controllers;

import com.openclassrooms.bibliotheque.models.SearchMember;
import com.openclassrooms.bibliotheque.models.SearchMemberBorrow;
import com.openclassrooms.bibliotheque.service.BorrowService;
import com.openclassrooms.bibliotheque.service.MemberService;
import com.openclassrooms.bibliotheque.ws.BorrowWs;
import com.openclassrooms.bibliotheque.ws.MemberWs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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


    /*@GetMapping("/borrow/{workId}")
    public String searchMemberForm(Model model, HttpSession session, @PathVariable int workId)  {

        session.setAttribute("workToBorrow", workId);

        model.addAttribute("searchMember", new SearchMember());

        model.addAttribute("findMemberResult", false);
        // retourne la jsp
        return "searchMemberPage";
    }*/

    // test emprunt sans recherche de membre
    @GetMapping("/borrow/{workId}")
    public String searchMemberForm(Model model, HttpSession session, @PathVariable Long workId)  {

        BorrowWs  borrowWs = borrowService.borrowBook(workId, Long.valueOf(String.valueOf(session.getAttribute("memberCoId"))));

        // retourne la jsp
        return "finalBorrow";
    }


    @PostMapping(path = "/borrow/searchMember")
    public String searchMember(Model model, @ModelAttribute("searchMember") SearchMember searchMember) {

        MemberWs memberFind = memberService.findMember(searchMember.getName(), searchMember.getMailAdress());

        model.addAttribute("findMemberResult", true);

        model.addAttribute("memberFind" ,memberFind);

        return "searchMemberPage";
    }

    @GetMapping("/borrow/selectMember/{memberFindId}")
    public String finalBorrowForm(Model model, HttpSession session, @PathVariable int memberFindId)  {


        Long workId = Long.valueOf(String.valueOf(session.getAttribute("workToBorrow")));

        BorrowWs  borrowWs = borrowService.borrowBook(workId, Long.valueOf(memberFindId));

        // retourne la jsp
        return "finalBorrow";
    }

    // extend Borrow========================================================================================================================

    // Menu => renvoie sur la page de recherche de membre
    @GetMapping("/searchMemberBorrow")
    public String searchMemberBorrowForm(Model model) {
        model.addAttribute("searchMemberBorrow", new SearchMemberBorrow());

        model.addAttribute("findMemberBorrowResult", false);
        // retourne la jsp
        return "searchMemberBorrowPage";
    }

    // test methode 2 en 1, recup du membre via le post, et recup la liste de borrow en settant le memberfind
    @PostMapping(path = "/searchMemberBorrow")
    public String searchMemberBorrow(Model model, @ModelAttribute("searchMemberBorrow") SearchMemberBorrow searchMemberBorrow) {

        MemberWs memberFind = memberService.findMember(searchMemberBorrow.getName(), searchMemberBorrow.getMailAdress());

        long memberFindId = memberFind.getId();

        //  List<BorrowWs> borrowListMember = borrowService.findBorrowListByMember(memberFind);

        List<BorrowWs> borrowListMember = borrowService.findBorrowListByMemberId(Long.valueOf(memberFindId));

        model.addAttribute("findMemberResult", true);

        model.addAttribute("memberFind" ,memberFind);

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
