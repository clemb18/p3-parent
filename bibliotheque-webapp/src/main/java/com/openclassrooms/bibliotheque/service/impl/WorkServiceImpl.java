package com.openclassrooms.bibliotheque.service.impl;

import com.openclassrooms.bibliotheque.service.WorkService;
import com.openclassrooms.bibliotheque.soap.client.WorkClient;
import com.openclassrooms.bibliotheque.ws.WorkWs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService{

    @Autowired
    private WorkClient workClient;

    @Override
    public List<WorkWs> findWorks(String author) {
       Assert.notNull(author, "Author must not be null.");
      return workClient.getWorkByAuthorResponse(author);

 }
}

