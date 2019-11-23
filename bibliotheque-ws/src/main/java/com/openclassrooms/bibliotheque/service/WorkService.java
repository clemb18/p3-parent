package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Work;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

public interface WorkService {

    public List<Work> getWorksByAuthor(String author);

    public List<Work> getWorksByPublicationDate (XMLGregorianCalendar publicationDate);

    public Work saveNewWork(Work work);

    public Work deleteWork(Integer workId);

    Work create(com.openclassrooms.projects.bibliot.Work work);


}