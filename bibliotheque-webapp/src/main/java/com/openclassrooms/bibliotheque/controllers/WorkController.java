package com.openclassrooms.bibliotheque.controllers;

import org.occ.bibliot.client.endpoint.Work;
import org.occ.bibliot.client.endpoint.WorkWeb;
import org.occ.bibliot.client.endpoint.WorkWs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WorkController {

    private static Logger logger = LoggerFactory.getLogger(WorkController.class);



    //instanciation des WorkWeb et Workws

    WorkWeb workWsService = new WorkWeb();
    WorkWs workWs;

    public WorkController() {
        this.workWs = this.workWsService.getWorkWsPort();
    }

    @RequestMapping(value = {"/work/{author}"}, method = {RequestMethod.GET})
    @ResponseBody
    public List<Work> getWorksByAuthor (@PathVariable String author) {
        this.workWs.init();
        List<Work> workByAuthor = this.workWs.getWorksByAuthor(author);
        return workByAuthor;
    }


    @RequestMapping (value = {"/work/{publicationDate}"}, method = {RequestMethod.GET})
    @ResponseBody
    public List<Work> getWorksByPublicationDate (@PathVariable Integer publicationDate) {
        this.workWs.init();
        List<Work> workByPublicationDate = this.workWs.getWorksByPublicationDate(publicationDate);
        return workByPublicationDate;
    }

    @RequestMapping (value = {"/Search"}, method = {RequestMethod.GET})
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
    }

}