package com.example.saimon.reshebnic;


public class Book {
    private String nameBook;
    private String authorBook;
    private String yearOfPrinting;
    private int image;


    public Book(String nameBook, String authorBook, String yearOfPrinting, int image) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.yearOfPrinting = yearOfPrinting;
        this.image = image;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorBook() {
        return this.authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public String getYearOfPrinting() {
        return this.yearOfPrinting;
    }

    public void setYearOfPrinting(String yearOfPrinting) {
        this.yearOfPrinting = yearOfPrinting;
    }

    public int getImage() {
        return this.image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
