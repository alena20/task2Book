package edu.epam.book.entity;

import java.util.Arrays;

public class Book {
    private static int Id = 1;
    private final int id = Id++;
    private final String name;
    private final String[] authors;
    private final String publisher;
    private final int year;
    private final int pagesCount;
    private int price;
    private final String bindingType;

    public Book(String name, String[] authors, String publisher, int year, int pagesCount, int price, String bindingType) {
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.pagesCount = pagesCount;
        this.price = price;
        this.bindingType = bindingType;
    }

    public static int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public static void setId(int id) {
        Id = id;
    }

    public String[] getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book ");
        sb.append("id: ").append(id).append("\r\n");
        sb.append("name: ").append(name).append("\r\n");
        sb.append("authors: ").append(Arrays.toString(authors)).append("\r\n");;
        sb.append("publisher: ").append(publisher).append("\r\n");
        sb.append("year: ").append(year).append("\r\n");
        sb.append("pagesCount: ").append(pagesCount).append("\r\n");
        sb.append("price: ").append(price).append("\r\n");
        sb.append("bindingType: ").append(bindingType).append("\r\n").append("\r\n");
        return sb.toString();
    }
}
