package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Work;
import com.openclassrooms.projects.bibliotheque.WorkWs;

import java.util.List;

public interface WorkService {

    public List<Work> getWorksByAuthor(String author);

    public List<Work> getWorksByTitle(String title);

    public List<Work> getWorksByPublicationDate (String publicationDate);

    Work create(WorkWs work);

    Work deleteWork(Long workId);


}