package com.openclassrooms.bibliotheque.service.impl;

import com.openclassrooms.bibliotheque.models.Book;
import com.openclassrooms.bibliotheque.repository.BookRepository;
import com.openclassrooms.bibliotheque.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class BookServiceImpl implements BookService {

    private static Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);



    @Autowired
    BookRepository bookRepository;

    public Book getBookById(Long bookId) {

        return bookRepository.findById(bookId).get();
    }

    public Book deleteBook(Long bookId) {
        logger.info("suppression d'un livre: {}", bookId);

        return bookRepository.delete(bookId);
    }

    @Override
    public Book create(Book book) {
        Book bookCreated = new Book();
        BeanUtils.copyProperties(book, bookCreated);
        bookCreated = bookRepository.save(book);
        return bookCreated;
    }
}

