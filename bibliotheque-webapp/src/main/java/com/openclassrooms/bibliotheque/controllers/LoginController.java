package com.openclassrooms.bibliotheque.controllers;

import com.openclassrooms.bibliotheque.models.Login;
import com.openclassrooms.bibliotheque.models.SearchMember;
import com.openclassrooms.bibliotheque.service.MemberService;
import com.openclassrooms.bibliotheque.service.UserService;
import com.openclassrooms.bibliotheque.ws.MemberWs;
import com.openclassrooms.bibliotheque.ws.UserWs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    private MemberService memberService;

    @GetMapping("")
    public String welcome(Model model) {
        model.addAttribute("login", new Login());
        return "login";
    }

    @PostMapping(path = "/login")
    public String login(Model model, @ModelAttribute("login") Login login) {
        UserWs user = userService.findUser(login.getUsername(), login.getPassword());
        if (user != null) {
            model.addAttribute("message", "Bienvenue " + user.getFirstName() + " "+ user.getName());
        } else {
            model.addAttribute("message", "Wrong login and/or password.");
        }
        return "login";
    }

    @PostMapping(path = "/loginMember")
    public  String loginMember(Model model, @ModelAttribute("loginMember") SearchMember searchMember) {
        MemberWs memberWs = memberService.findMemberLogin(searchMember.getMailAdress(), searchMember.getPassword());
        if (memberWs != null) {
            model.addAttribute("message", "Bienvenue " + memberWs.getFirstName() + " "+ memberWs.getName());
        } else {
            model.addAttribute("message", "Wrong login and/or password.");
        }
        return "login";
    }
}
