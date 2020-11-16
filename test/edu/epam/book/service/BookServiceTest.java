package edu.epam.book.service;

import edu.epam.book.entity.Book;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class BookServiceTest {

    @Test
    public void filterAuthor(){
        String[] authorsBook1 = {"J.K. Rowling"};
        Book book1 = new Book("Harry Potter and chamber of secrets", authorsBook1, "Rosman", 2012, 256, 406, "limp");
        String[] authorBook2 = {"J.K. Rowling"};
        Book book2 = new Book("Harry Potter and prisoner of Azkaban", authorBook2, "Mahaon", 2014, 308, 432, "hard");
        String[] authorBook3 = {"Johnny Ball", "Richard Hammond", "J.K. Rowling"};
        Book book3 = new Book("Cursed child", authorBook3, "Reader's Digest", 2008, 288, 198, "hard");
        Book[] books = {book1, book2,book3};
        List<Book> bookList = new ArrayList<>();
        bookList.add(book2);
        bookList.add(book3);
        BookService service = new BookService();
        List<Book> list = service.listByAuthor("Robert Winston", books);
        Assert.assertEquals(bookList.toString(),list.toString());
    }

}