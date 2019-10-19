package org.occ.bibliot.repository;


import org.occ.bibliot.model.beans.Book;

import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Integer>{

}
