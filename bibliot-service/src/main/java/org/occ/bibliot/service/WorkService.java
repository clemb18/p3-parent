package org.occ.bibliot.service;

import org.occ.bibliot.model.beans.Work;

import java.util.List;

public interface WorkService {

    public List<Work> getWorksByAuthor(String author);

    public List<Work> getWorksByPublicationDate (Integer publicationDate);

    public Work saveNewWork(Work work);

    public Work deleteWork(Integer workId);


}