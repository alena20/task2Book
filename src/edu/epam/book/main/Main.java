package edu.epam.book.main;

import edu.epam.book.entity.Book;
import edu.epam.book.report.BookReport;
import edu.epam.book.service.BookService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] authorsBook1 = {"J.K. Rowling"};
        Book book1 = new Book("Harry Potter and chamber of secrets", authorsBook1, "Rosman", 2012, 256, 406, "limp");
        String[] authorBook2 = {"J.K. Rowling"};
        Book book2 = new Book("Harry Potter and prisoner of Azkaban", authorBook2, "Mahaon", 2014, 308, 432, "hard");
        String[] authorBook3 = {"Johnny Ball", "Richard Hammond", "J.K. Rowling"};
        Book book3 = new Book("Cursed child", authorBook3, "Reader's Digest", 2008, 288, 198, "hard");
        Book[] books = {book1, book2,book3};
        BookService service = new BookService();
        List<Book> listByAuthor =  service.listByAuthor("Robert Winston", books);
        List<Book> listByPublisher =  service.booksByPublisher("Robert Winston", books);
        List<Book> ListBookAfterYear = service.booksAfterYear(2009, books);
        BookReport report = new BookReport();
        report.printReport("Filtered by author",listByAuthor);
        report.printReport("Filtered by publisher",listByPublisher);
        report.printReport("Filtered by year",ListBookAfterYear);

    }

}
