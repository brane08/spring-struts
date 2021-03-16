package org.brane.struts.services;

import org.brane.struts.domain.Author;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AuthorsService extends GenericService<Author, UUID> {

    public AuthorsService() {
        super(Author.class);
    }
}
