package com.company;

public class Book {
  private String title;
  private String author;
  private String date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    Book(){}

    Book(String title, String author, String date){
      this.title = title;
      this.author = author;
      this.date = date;
    }
}
