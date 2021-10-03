package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookControllerTest {


    @Test
    public void shouldAddBooks() {
        //given
        BookService bookService = new BookService();
        BookController bookController = new BookController(bookService);
        bookController.addBook(new BookDto("Title", "Author"));

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(1);
    }
}