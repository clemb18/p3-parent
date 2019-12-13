package com.openclassrooms.bibliotheque.service.impl;

import com.openclassrooms.bibliotheque.models.Work;
import com.openclassrooms.bibliotheque.repository.WorkRepository;
import com.openclassrooms.bibliotheque.service.WorkService;
import com.openclassrooms.projects.bibliot.WorkWs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;


@Service
public class WorkServiceImpl implements WorkService {

    private static Logger logger = LoggerFactory.getLogger(WorkServiceImpl.class);

    @Autowired
    WorkRepository workRepository;

    @Override
    public List<Work> getWorksByAuthor(String author) {

        return workRepository.findByAuthorIsContainingIgnoreCase(author);
    }

    @Override
    public List<Work> getWorksByPublicationDate(XMLGregorianCalendar publicationDate) {

        return workRepository.findByPublicationDate(publicationDate);

    }

    @Override
    public Work create(WorkWs work) {
        Work workCreated = new Work();
        BeanUtils.copyProperties(work, workCreated);
        workCreated = workRepository.save(workCreated);
        return workCreated;
    }
}