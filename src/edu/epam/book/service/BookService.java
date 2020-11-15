package edu.epam.book.service;

import edu.epam.book.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    public List<Book> listByAuthor(String author, Book[] books) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            for (String authorBook : book.getAuthors()) {
                if (author.equals(authorBook)) {
                    result.add(book);
                }
            }
        }
        return result;
    }

    public List<Book> booksByPublisher(String publisher, Book[] books) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (publisher.equals(book.getPublisher())) {
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> booksAfterYear(int year, Book[] books) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (year < book.getYear()) {
                result.add(book);
            }
        }
        return result;
    }
}
