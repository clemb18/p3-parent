package org.occ.p3.controler;

import org.occ.p3.model.Borrow;
import org.occ.p3.model.Member;
import org.occ.p3.service.BorrowService;
import org.occ.p3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class BorrowControler {

    @Autowired
    BorrowService borrowService;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/borrow/{workId}", method = RequestMethod.GET)
    public ModelAndView borrowBook(HttpServletRequest request, @PathVariable("workId") Integer workId) {

        ModelAndView modelAndView = null;
        Member memberCo = (Member) request.getSession().getAttribute("memberConnected");

        if (memberCo == null) {

            modelAndView = new ModelAndView("jsp/connexion");
            modelAndView.addObject("msg", "Veuillez vous connecter pour emprunter un livre");

        } else {

            Integer membreId = memberCo.getId();

            System.out.println(membreId);

            Boolean emprunt = borrowService.borrowBook(workId, membreId);

            if (emprunt == true) {

                // lien vers jsp de recherche avec message de succès
                modelAndView = new ModelAndView("jsp/borrowListPage");
                modelAndView.addObject("msg", "L'emprunt à été realisé avec succès");
                List<Borrow> memberBorrowList = userService.findBorrowListByUserRef(membreId);
                modelAndView.addObject("memberborrowList", memberBorrowList);

            } else {
                modelAndView = new ModelAndView("jsp/borrowerror");
                modelAndView.addObject("msg", "Une erreur est survenue, l'emprunt n'a pas pu être réalisé");

            }

        }

        return modelAndView;
    }

    @RequestMapping(value = "/borrowList", method = RequestMethod.GET)
    public ModelAndView borrowList(HttpServletRequest request) {

        ModelAndView modelAndView = null;
        // On recupère MemberConnected de la session
        Member memberCo = (Member) request.getSession().getAttribute("memberConnected");


        if (memberCo == null) {
            // Si pas de membre co on renvoie vers la page de connexion
            modelAndView = new ModelAndView("jsp/connexion");
            modelAndView.addObject("msg", "Veuillez vous connecter pour afficher vos prêts en cours");
        } else {

            Integer membreId = memberCo.getId();

            // On recupère sa borrowList
            List<Borrow> memberBorrowList = userService.findBorrowListByUserRef(membreId);


            // Affichage de la borrowList
            modelAndView = new ModelAndView("jsp/borrowListPage");
            modelAndView.addObject("msg", "Voici la liste de vos emprunts en cours:");
            modelAndView.addObject("memberborrowList", memberBorrowList);
        }
        return modelAndView;
    }


    @RequestMapping(value = "/extendBorrow/{borrowId}", method = RequestMethod.GET)
    public ModelAndView extendBorrow(HttpServletRequest request, @PathVariable("borrowId") Integer borrowId) {

        ModelAndView modelAndView = null;

        Boolean extend = borrowService.extendBorrow(borrowId);

        if (extend == true) {

            // lien vers jsp de recherche avec message de succès
            modelAndView = new ModelAndView("jsp/indexCo");
            modelAndView.addObject("msg", "Votre emprunt à été ralongé d'un mois");

        } else {
            modelAndView = new ModelAndView("jsp/indexCo");
            modelAndView.addObject("msg", "Une erreur est survenue, vous avez déjà allongé votre période d'emprunt");

        }
        return modelAndView;
    }

    @RequestMapping(value = "/endBorrow/{borrowId}", method = RequestMethod.GET)
    public ModelAndView endBorrow(HttpServletRequest request, @PathVariable("borrowId") Integer borrowId) {

        ModelAndView modelAndView = null;

        Boolean endBorrow = borrowService.endBorrow(borrowId);

        if (endBorrow == true) {


            // lien vers jsp de recherche avec message de succès
            modelAndView = new ModelAndView("jsp/indexCo");
            modelAndView.addObject("msg", "Votre emprunt à bien été clôturé");

        } else {

            modelAndView = new ModelAndView("jsp/indexCo");
            modelAndView.addObject("msg", "Une erreur est survenue, le retour de votre livre n'a pas été réalisé");
        }

        return modelAndView;
    }
}








