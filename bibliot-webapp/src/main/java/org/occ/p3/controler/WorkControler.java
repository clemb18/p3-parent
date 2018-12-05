package org.occ.p3.controler;

import org.occ.p3.model.Work;
import org.occ.p3.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WorkControler {

    @Autowired
    WorkService workService;

    @RequestMapping(value = "/work/{author}", method = RequestMethod.GET)

    public @ResponseBody
    List<Work> getWorksByAuthor (@PathVariable String author) {
        List<Work> workByAuthor = workService.getWorksByAuthor(author);
        return workByAuthor;
    }

    @RequestMapping (value = "/work/{publicationDate}", method = RequestMethod.GET)

    public @ResponseBody
    List<Work> getWorksByPublicationDate (@PathVariable Integer publicationDate) {
        List<Work> workByPublicationDate = workService.getWorksByPublicationDate(publicationDate);
        return workByPublicationDate;
    }
}
