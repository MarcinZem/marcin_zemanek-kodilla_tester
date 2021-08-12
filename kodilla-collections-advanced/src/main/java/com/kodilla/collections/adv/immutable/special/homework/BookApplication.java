package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("Lord of the rings", "J.R.R. Tolkien");
        Book book = BookManager.createBook("Harry Potter", "Rowling");
        System.out.println(book == book1);
        System.out.println(book.equals(book1));
    }
}
