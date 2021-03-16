package org.brane.struts.services;

import org.brane.struts.domain.Book;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.UUID;

@Service
public class BooksService extends GenericService<Book, UUID> {

    public BooksService() {
        super(Book.class);
    }
}
