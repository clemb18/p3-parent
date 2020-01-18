package com.openclassrooms.bibliotheque.controllers;

import com.openclassrooms.bibliotheque.models.SearchWork;
import com.openclassrooms.bibliotheque.service.WorkService;
import com.openclassrooms.bibliotheque.ws.WorkWs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class WorkController {

    private static Logger logger = LoggerFactory.getLogger(WorkController.class);

    @Autowired
    private WorkService workService;



    @GetMapping("/searchWork")
    public String searchWorkForm(Model model) {
        model.addAttribute("searchWork", new SearchWork());

        model.addAttribute("findResult", false);
        // retourne la jsp
        return "search";
    }


    @PostMapping(path = "/searchByAuthor")
    public String searchByAuthor(Model model, @ModelAttribute("searchWork") SearchWork searchWork) {

        List<WorkWs> listWorks = workService.findWorks(searchWork.getAuthor());

        model.addAttribute("findResult", true);

        model.addAttribute("listWorks" ,listWorks);

        return "search";
    }








 /*   @RequestMapping(value = {"/work/{author}"}, method = {RequestMethod.GET})
    @ResponseBody
    public List<Work> getWorksByAuthor (@PathVariable String author) {
        this.workWs.init();
        List<Work> workByAuthor = this.workWs.getWorksByAuthor(author);
        return workByAuthor;
    }



    @RequestMapping (value = {"/searchWork"}, method = {RequestMethod.GET})
    public ModelAndView searchPage() {
        ModelAndView search = new ModelAndView("search");
        return search;
    }

    @RequestMapping(value = {"/doSearch"}, method = {RequestMethod.POST})
    public ModelAndView search(@RequestParam("searchText") String searchText) {
        this.workWs.init();

        logger.info("texte recu = " + searchText);
        List<Work> workByAuthor = this.workWs.getWorksByAuthor(searchText);

        ModelAndView mav = new ModelAndView("SearchResults");
        mav.addObject("foundWorks", workByAuthor);
        logger.info("taille liste recue = " + workByAuthor.size());

        return mav;
    }*/

}


