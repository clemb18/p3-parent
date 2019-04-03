package org.occ.p3.controler;

//import org.occ.p3.model.Work;
//import org.occ.p3.service.WorkService;


import org.occ.p3.client.Work;
import org.occ.p3.client.WorkWeb;
import org.occ.p3.client.WorkWs;
import org.occ.p3.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class WorkControler {

    @Autowired
    WorkService workService;

    @RequestMapping (value = "/bibliot-webapp/search", method = RequestMethod.GET)
    public String search() {
        return "jsp/search";
    }



    @RequestMapping(value = "/searchByAuthor", method = RequestMethod.POST)
    public ModelAndView getWorksByAuthor (@RequestParam(value="author") String author) {

        //WorkWeb wsWorkService = new WorkWeb();
        //WsWork wsWork = wsWorkService.getWsWorkPort();
        //List<Work> workByAuthor = wsWork.getWorksByAuthor(author);

        //List<Work> workByAuthor = workService.getWorksByAuthor(author);

        WorkWeb workWsService = new WorkWeb();
        WorkWs workWs = workWsService.getWorkWsPort();
        List<Work> workByAuthor = workWs.getWorksByAuthor(author);

        //List<org.occ.p3.client.Work> workByAuthor = workWs.getWorksByAuthor(author);

        ModelAndView toReturn = new ModelAndView("jsp/search");
        toReturn.addObject("listWorks", workByAuthor);
        return toReturn;
    }

    @RequestMapping (value = "/searchByPublicationDate", method = RequestMethod.POST)
    public ModelAndView getWorksByPublicationDate (@RequestParam(value="publicationDate") Integer publicationDate) {

        //WorkWeb wsWorkService = new WorkWeb();
        //WsWork wsWork = wsWorkService.getWsWorkPort();
        //List<Work> workByPublicationDate = wsWork.getWorksByPublicationDate(publicationDate);

        WorkWeb wsWorkService = new WorkWeb();
        WorkWs workWs = wsWorkService.getWorkWsPort();
        List<Work> workByPublicationDate = workWs.getWorksByPublicationDate(publicationDate);



        ModelAndView totoReturn = new ModelAndView("jsp/search");
        totoReturn.addObject("listWorksByPublicationDate", workByPublicationDate);
        return totoReturn;
    }


}
