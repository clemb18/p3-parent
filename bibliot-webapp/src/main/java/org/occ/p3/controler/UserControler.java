package org.occ.p3.controler;

import org.occ.p3.client.Member;
import org.occ.p3.client.UserWeb;
import org.occ.p3.client.UserWs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//import org.occ.p3.client.endpoint.User;

@Controller
public class UserControler {
    @Autowired
    private HttpServletRequest request;
    UserWeb userWsService = new UserWeb();
    UserWs userWs;

    public UserControler() {
        this.userWs = this.userWsService.getUserWsPort();
    }

    @RequestMapping(value = {"/connexion"}, method = {RequestMethod.GET})
    public String login() {
        return "connexion";
    }


    @RequestMapping(value = {"/"}, method = {RequestMethod.GET})
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("connexion");
        return modelAndView;
    }

    @RequestMapping(value = {"/authentificate"}, method = {RequestMethod.POST})
    public ModelAndView authentification(HttpServletRequest request) {
        this.userWs.init();
        System.out.println("toto nous sommes bien arrivés");

        ModelAndView modelAndView = null;

        String username = request.getParameter("user");
        String password = request.getParameter("password");

        if (username != null & password != null) {

            Member result = this.userWs.isValidUser(username, password);

            if (result != null) {
                System.out.println("l'utilisateur existe");


                // Je dis que le mec est connecté
                Member memberConnected = this.userWs.isValidUser(username, password);
                //userService.findMemberByUsernameAndPassword(username,password);
                System.out.println("le membre connecté a enregistré est " + memberConnected);
                request.getSession().setAttribute("connected", true);
                request.getSession().setAttribute("memberConnected", memberConnected);
                modelAndView = new ModelAndView("profil");
                modelAndView.addObject("memberConnected", memberConnected);
                System.out.println("le membre est connecté");
                //System.out.println(memberConnected.getName());


            } else {

                modelAndView = new ModelAndView("/connexion");
                modelAndView.addObject("msg", "Wrong username and or password");

            }
        } else {

            modelAndView = new ModelAndView("/error");
        }
        return modelAndView;
    }


    @RequestMapping(value = {"/logout"}, method = {RequestMethod.GET})
    public ModelAndView logout(HttpSession session) {

        ModelAndView modelAndView = null;

        session.invalidate();
        modelAndView = new ModelAndView("/connexion");
        modelAndView.addObject("msg", "Vous êtes deconnecté");

        return modelAndView;
    }


}






