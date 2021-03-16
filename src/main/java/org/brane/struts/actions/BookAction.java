package org.brane.struts.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.brane.struts.domain.Book;
import org.brane.struts.domain.dto.BookDto;
import org.brane.struts.domain.mappers.BookMapper;
import org.brane.struts.services.BooksService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Action
@Component
public class BookAction extends ActionSupport {

    private static final Logger logger = LoggerFactory.getLogger(BookAction.class);
    private final BooksService service;
    private final BookMapper mapper;
    private List<BookDto> books;

    @Autowired
    public BookAction(BooksService service, BookMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    public String execute() throws Exception {
        this.books = service.all().stream().map(mapper::toDto).collect(Collectors.toList());
        logger.info("{}", books.size());
        return SUCCESS;
    }

    public List<BookDto> getBooks() {
        return books;
    }
}
