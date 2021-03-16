package org.brane.struts.domain.mappers;

import org.brane.struts.domain.Book;
import org.brane.struts.domain.dto.BookDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDto toDto(Book book);
}
