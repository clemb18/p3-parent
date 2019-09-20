package org.occ.p3.controler;

import org.occ.p3.client.Work;
import org.occ.p3.client.WorkWeb;
import org.occ.p3.client.WorkWs;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WorkControler {



    //instanciation des WorkWeb et Workws

    WorkWeb workWsService = new WorkWeb();
    WorkWs workWs;

    public WorkControler() {
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
        System.out.println("texte recu = " + searchText);
        List<Work> workByAuthor = this.workWs.getWorksByAuthor(searchText);

        ModelAndView mav = new ModelAndView("SearchResults");
        mav.addObject("foundWorks", workByAuthor);
        System.out.println("taille liste recue = " + workByAuthor.size());
        return mav;
    }

}