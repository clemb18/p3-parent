package com.openclassrooms.bibliotheque.repository;

import com.openclassrooms.bibliotheque.models.WorkModelWs;
import org.springframework.data.repository.CrudRepository;

import java.util.List;



public interface WorkRepository extends CrudRepository<WorkModelWs, Integer> {


    List<WorkModelWs> findByPublicationDate(Integer publicationDate);


    List<WorkModelWs> findByAuthorIsContainingIgnoreCase(String author);


    WorkModelWs delete(Integer workId);

    com.openclassrooms.projects.bibliot.Work save(WorkModelWs work);


}
