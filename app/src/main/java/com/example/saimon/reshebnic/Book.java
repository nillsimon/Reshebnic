package com.example.saimon.reshebnic;


public class Book {
    private String nameBook;
    private String titleBook;
    private String description;
    private String authorBook;
    private String yearOfPrinting;
    private String level;
    private String publishing;
    private String m_class;
    private int image;

    public Book(String nameBook, String titleBook, String description, String authorBook, String yearOfPrinting, String lavel, String publishing, String m_class, int image) {
        this.nameBook = nameBook;
        this.titleBook = titleBook;
        this.description = description;
        this.authorBook = authorBook;
        this.yearOfPrinting = yearOfPrinting;
        this.level = lavel;
        this.publishing = publishing;
        this.m_class = m_class;
        this.image = image;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public String getYearOfPrinting() {
        return yearOfPrinting;
    }

    public String getLevel() {
        return level;
    }

    public String getPublishing() {
        return publishing;
    }

    public String getM_class() {
        return m_class;
    }

    public int getImage() {
        return image;
    }
}
