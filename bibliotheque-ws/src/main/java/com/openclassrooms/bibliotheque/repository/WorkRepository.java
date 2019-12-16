package com.openclassrooms.bibliotheque.repository;

import com.openclassrooms.bibliotheque.models.Work;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;


@Repository
public interface WorkRepository extends CrudRepository<Work, Long> {


    List<Work> findByPublicationDate(XMLGregorianCalendar publicationDate);


    List<Work> findByAuthorIsContainingIgnoreCase(String author);


    Work delete(Long workId);

    Work save(Work work);


}
