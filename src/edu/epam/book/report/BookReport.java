package edu.epam.book.report;

import edu.epam.book.entity.Book;

import java.util.List;
import java.util.logging.Logger;

public class BookReport {
    static final Logger LOGGER = Logger.getLogger("");
    public void printReport(String action, List<Book> book){
        LOGGER.info(action);
        for(int i =0;i<book.size();i++){
            LOGGER.info(book.toString());
        }
    }
}
