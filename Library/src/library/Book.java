package library;

import java.io.Serializable;
import java.util.ArrayList;

public class Book implements Serializable {
     ArrayList<Loan> loanHistory = new ArrayList<Loan>();
    
    
    // UID
    private static final long serialVersionUID = 7724325370012823291L;

    // Zmienne klasy
    private String nameBook;
    private String author;
    private String publisher;
    private int publishingYear;
    private int numberOfBooks;

     public Book() {
         
    }
    
    // Konstruktor
    public Book(String nameBook, String author, String publisher, int publishingYear, int numberOfBooks) {
        this.nameBook = nameBook;
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.numberOfBooks = numberOfBooks;

    }
    
    // Gettery
    public String getNameBook() {
        return nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }
    // Settery

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
    
    public void loan(Loan loan) {
        loanHistory.add(loan);
        
        }
    
    // toString.
     public String toString() 
    {
        return 
             "---------------------------Ksi��ki---------------------------" +
                "\nNazwa ksi��ki: " + nameBook + 
                "\nAutor: "+ author + 
                "\nWydawnictwo : "+ publisher + 
                "\nRok wydania publikacji : " + publishingYear +
                "\nLiczba ksi��ek : " + numberOfBooks +"\n\n";
    }

 

}
