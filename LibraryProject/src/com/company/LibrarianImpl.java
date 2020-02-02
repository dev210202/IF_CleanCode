package com.company;

import java.util.ArrayList;

public class LibrarianImpl implements Librarian {

    public Book findBookByTitle(String title, ArrayList<Book> bookList) {

        for (Book book : bookList){
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public Book findBookByAuthor(String author, ArrayList<Book> bookList) {

        for (Book book : bookList){
            if (book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }

    public Book findBookByDate(String date, ArrayList<Book> bookList) {

        for (Book book : bookList){
            if (book.getDate().equals(date)) {
                return book;
            }
        }
        return null;
    }

    public void printBookInfo(Book book) {
        System.out.println("Title: " + book.getTitle() +", Author: "+ book.getAuthor() + ", Date: "+ book.getDate());
    }

    public void addBook(Book book, ArrayList<Book> bookList) {
        bookList.add(book);
    }

    public void removeBook(Book book, ArrayList<Book> bookList){
        bookList.remove(book);
    }

    public void reviseBook(Book book, Book userBook){
        book.setTitle(userBook.getTitle());
        book.setAuthor(userBook.getAuthor());
        book.setDate(userBook.getDate());
    }
}
