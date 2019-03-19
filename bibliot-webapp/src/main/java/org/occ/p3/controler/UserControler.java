package org.occ.p3.controler;

import org.occ.p3.model.Member;
import org.occ.p3.model.User;
import org.occ.p3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserControler {

    @RequestMapping(value = "/connexion", method = RequestMethod.GET)
    public String login() {

        return "jsp/connexion";
    }


    @Autowired
    UserService userService;

    @RequestMapping(value = "/authentificate", method = RequestMethod.POST)
    public ModelAndView authentification(HttpServletRequest request){

        boolean result;

        ModelAndView modelAndView = null;

        String userName = request.getParameter("user");
        String password = request.getParameter("password");

        System.out.println("user = " + userName);
        System.out.println("password = " + password);

        if(userName !=null & password !=null) {

            result = userService.isValidUser(userName, password);

            if (result == true) {

                System.out.println("le user est en base");

                modelAndView = new ModelAndView("jsp/indexCo");
                modelAndView.addObject("msg","Bienvenue ! Vous êtes bien connecté !");

                //Je dis que l'utilisateur est connecté

                Member memberConnected = (Member) userService.findByUserNameAndPassword(userName,password);

                request.getSession().setAttribute("connected", true);

                request.getSession().setAttribute("currentSessionUser",memberConnected);

                request.getSession().setAttribute("memberConnected",memberConnected);
                modelAndView.addObject("memberConnected",memberConnected);

            } else {

            System.out.println("le user est pas ds la base");
                modelAndView = new ModelAndView("jsp/index");
                modelAndView.addObject("msg","Wrong username and or password");
            }
        } else {
            modelAndView = new ModelAndView("jsp/index");
            modelAndView.addObject("msg","Une erreur est survenue");
        }

        return modelAndView;

    }

    @RequestMapping(value = "/moncompte", method = RequestMethod.GET)
    public String userProf() {

        return "jsp/userPage";
    }

}






