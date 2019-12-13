package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Work;
import com.openclassrooms.projects.bibliot.WorkWs;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

public interface WorkService {

    public List<Work> getWorksByAuthor(String author);

    public List<Work> getWorksByPublicationDate (XMLGregorianCalendar publicationDate);

    Work create(WorkWs work);


}