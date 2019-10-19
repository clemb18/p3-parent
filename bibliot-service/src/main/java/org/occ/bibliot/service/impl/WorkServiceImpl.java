package org.occ.bibliot.service.impl;

import org.occ.bibliot.repository.WorkRepository;
import org.occ.bibliot.model.beans.Work;
import org.occ.bibliot.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WorkServiceImpl implements WorkService {
    @Autowired
    WorkRepository workRepository;

    @Override
    public List<Work> getWorksByAuthor(String author) {

        /// Appeler le consumer

        List<Work> worksGotFromConsumer = workRepository.findByAuthorIsContainingIgnoreCase(author);

        return worksGotFromConsumer;
    }

    @Override
    public List<Work> getWorksByPublicationDate(Integer publicationDate) {

        /// Appeler le consumer

        List<Work> worksGotFromConsumer = workRepository.findByPublicationDate(publicationDate);

        return worksGotFromConsumer;

    }
}
