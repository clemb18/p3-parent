package com.openclassrooms.bibliotheque.service.impl;

import com.openclassrooms.bibliotheque.models.BookModelWs;
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

    public BookModelWs getBookById(Integer bookId) {

        return bookRepository.findById(bookId).get();
    }

    public String test() {
        return "Oui le service répond";
    }


    public BookModelWs saveNewBook(BookModelWs book) {
        logger.info("enregistrement d'un nouveau livre: {}", book);

        return bookRepository.save(book);
    }

    public BookModelWs deleteBook(Integer bookId) {
        logger.info("suppression d'un livre: {}", bookId);

        return bookRepository.delete(bookId);
    }

    @Override
    public BookModelWs create(com.openclassrooms.projects.bibliot.Book book) {
        BookModelWs bookCreated = new BookModelWs();
        BeanUtils.copyProperties(book, bookCreated);
        bookCreated = bookRepository.save(book);
        return bookCreated;
    }
}

