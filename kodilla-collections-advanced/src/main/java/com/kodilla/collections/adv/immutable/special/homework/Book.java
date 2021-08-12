package com.kodilla.collections.adv.immutable.special.homework;

public class Book {
     final String author;
     final String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public final String getAuthor() {
        return author;
    }

    public final String getTitle() {
        return title;
    }
}

