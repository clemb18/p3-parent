package com.openclassrooms.bibliotheque.repository;

import com.openclassrooms.bibliotheque.models.Work;
import org.springframework.data.repository.CrudRepository;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;



public interface WorkRepository extends CrudRepository<Work, Long> {


    List<Work> findByPublicationDate(XMLGregorianCalendar publicationDate);


    List<Work> findByAuthorIsContainingIgnoreCase(String author);


    Work delete(Long workId);

    Work save(Work work);


}
