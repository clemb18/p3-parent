package org.occ.p3.controler;

//import org.occ.p3.model.Work;
//import org.occ.p3.service.WorkService;

import org.occ.p3.client.ws.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class WorkControler {

    org.occ.p3.client.ws.WorkWeb WorkWeb = new WorkWeb();
    WsWork WsWork = WorkWeb.getWsWorkPort();


    //@Autowired
    //WorkService workService;


    @RequestMapping (value = "/bibliot-webapp/search", method = RequestMethod.GET)
    public String search() {
        return "jsp/search";
    }



    @RequestMapping(value = "/searchByAuthor", method = RequestMethod.POST)
    public ModelAndView getWorksByAuthor (@RequestParam(value="author") String author) {
        //List<Work> workByAuthor = workService.getWorksByAuthor(author);

        // relier toutes mes méthodes au client à la place du business
         // appeler declarer l'interface du client
        // peut etre ok GetWorksByAuthor getWorksByAuthor = new GetWorksByAuthor();
        //GetWorksByAuthor getWorksByAuthor = new GetWorksByAuthor();
        //getWorksByAuthor.setAuthor(request.getParameter("author"));
        // peut etre ok GetWorksByAuthorResponse getWorksByAuthorResponse = (GetWorksByAuthorResponse) WsWork.getWorksByAuthor(author);
        //List<Work> workByAuthor = WsWork.getWorksByAuthor(author);

        // appeler la methode client
        //List<org.occ.p3.client.ws.Work> workByAuthor = (List<Work>) getWorksByAuthorResponse;
        //List<Work> workByAuthor = WsWork.getWorksByAuthor(author);
        List<org.occ.p3.client.ws.Work> workByAuthor = WsWork.getWorksByAuthor(author);

        ModelAndView toReturn = new ModelAndView("jsp/search");
        toReturn.addObject("listWorks", workByAuthor);
        return toReturn;
    }

    @RequestMapping (value = "/searchByPublicationDate", method = RequestMethod.POST)
    public ModelAndView getWorksByPublicationDate (@RequestParam(value="publicationDate") Integer publicationDate) {

        List<Work> workByPublicationDate = WsWork.getWorksByPublicationDate(publicationDate);

        GetWorksByPublicationDate getWorksByPublicationDate = new GetWorksByPublicationDate();

        GetWorksByPublicationDateResponse getWorksByPublicationDateResponse = (GetWorksByPublicationDateResponse) WsWork.getWorksByPublicationDate(publicationDate);

        workByPublicationDate = (List<Work>) getWorksByPublicationDateResponse;


        ModelAndView totoReturn = new ModelAndView("jsp/search");
        totoReturn.addObject("listWorksByPublicationDate", workByPublicationDate);
        return totoReturn;
    }


}
