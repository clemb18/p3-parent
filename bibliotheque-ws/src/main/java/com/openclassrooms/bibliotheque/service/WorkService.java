package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.WorkModelWs;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

public interface WorkService {

    public List<WorkModelWs> getWorksByAuthor(String author);

    public List<WorkModelWs> getWorksByPublicationDate (XMLGregorianCalendar publicationDate);

    public com.openclassrooms.projects.bibliot.Work saveNewWork(WorkModelWs work);

    public WorkModelWs deleteWork(Integer workId);

    WorkModelWs create(com.openclassrooms.projects.bibliot.Work work);


}