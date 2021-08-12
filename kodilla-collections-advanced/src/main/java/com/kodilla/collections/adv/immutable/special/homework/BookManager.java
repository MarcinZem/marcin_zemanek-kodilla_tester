package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
    public static Book createBook(String title, String author) {
        Book book = new Book(author, title);
        if (books.contains(book))
            return book;
        else {
            books.add(book);
            return book;
        }
    }

    static Set<Book> books = new HashSet<>();

}
