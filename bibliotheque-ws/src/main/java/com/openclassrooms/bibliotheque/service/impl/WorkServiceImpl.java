package com.openclassrooms.bibliotheque.service.impl;

import com.openclassrooms.bibliotheque.models.WorkModelWs;
import com.openclassrooms.bibliotheque.repository.WorkRepository;
import com.openclassrooms.bibliotheque.service.WorkService;
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
    public List<WorkModelWs> getWorksByAuthor(String author) {

        return workRepository.findByAuthorIsContainingIgnoreCase(author);
    }

    @Override
    public List<WorkModelWs> getWorksByPublicationDate(XMLGregorianCalendar publicationDate) {

        return workRepository.findByPublicationDate(publicationDate);

    }

    public com.openclassrooms.projects.bibliot.Work saveNewWork(WorkModelWs work) {
        logger.info("enregistrement d'uen nouvelle oeuvre: {}", work);

        return workRepository.save(work);
    }

    public WorkModelWs deleteWork(Integer workId) {
        logger.info("suppression d'une oeuvre: {}", workId);

        return workRepository.delete(workId);
    }

    @Override
    public WorkModelWs create(com.openclassrooms.projects.bibliot.Work work) {
        WorkModelWs workCreated = new WorkModelWs();
        BeanUtils.copyProperties(work, workCreated);
        workCreated = workRepository.save(work);
        return workCreated;
    }
}