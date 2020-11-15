package edu.epam.book.main;

import edu.epam.book.entity.Book;
import edu.epam.book.report.BookReport;
import edu.epam.book.service.BookService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] authorsBook1 = {"Stephen Hawking"};
        Book book1 = new Book("The Grand Design", authorsBook1, "Transworld Digital", 2015, 256, 406, "limp");

        String[] authorBook2 = {"Robert Winston"};
        Book book2 = new Book("SuperHuman Encyclopedia", authorBook2, "Dorling Kindersley", 2014, 208, 432, "hard");

        String[] authorBook3 = {"Johnny Ball", "Richard Hammond", "Robert Winston"};
        Book book3 = new Book("Think of Number. Can You Feel the Force? What Makes Me Me?", authorBook3, "Reader's Digest", 2008, 288, 198, "hard");

        Book[] books = {book1, book2, book3};
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
