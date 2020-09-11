package Lab1;

import java.lang.*;

public class Book {
    //fields
    private String name;
    private String author;
    private int numberOfBooks;
    private int cost;
    private boolean available;

    //Constructor
    public Book(String name, String author, int numberOfBooks, int cost, boolean available) {
        this.name = name;
        this.author = author;
        this.numberOfBooks = numberOfBooks;
        this.cost = cost;
        this.available = available;
    }

    public Book() {
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    //return information
    public void returnInformation() {
        System.out.println("----------INFORMATION OF BOOK-----------");
        System.out.println("Name of book: " + this.getName());
        System.out.println("Name of author: " + this.getAuthor());
        System.out.println("Number of books: " + this.getNumberOfBooks());
        System.out.println("Cost: " + this.getCost() + " USD");
        System.out.println("Available or not: " + this.getAvailable());
        System.out.println("-------------------END-----------------");
    }
}

