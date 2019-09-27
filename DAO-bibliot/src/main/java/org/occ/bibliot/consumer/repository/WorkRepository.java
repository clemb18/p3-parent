package org.occ.bibliot.consumer.repository;

import org.occ.bibliot.model.beans.Work;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface WorkRepository extends CrudRepository<Work, Integer> {


    List<Work> findByPublicationDate(Integer publicationDate);


    List<Work> findByAuthorIsContainingIgnoreCase(String author);




}
