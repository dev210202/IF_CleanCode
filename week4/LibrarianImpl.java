package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class LibrarianImpl implements Librarian{
    @Override
    public Book findBookByTitle(String title, ArrayList<Book> bookList) {
        for(Book iterator : bookList) {
            if(iterator.getTitle().equals(title)) {
                return iterator;
            }
        }
        return null;
    }

    @Override
    public void printBookInfo(Book book) {
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getDate());
    }

    @Override
    public void addBook(Book book, ArrayList<Book> bookList) {
        bookList.add(book);
    }

    @Override
    public void removeBook(Book book, ArrayList<Book> bookList) {
        for(Iterator<Book> it = bookList.iterator(); it.hasNext() ; ) { ;
            if(isBookEqual(it.next(),book)) {
                it.remove();
            }
        }
    }

    @Override
    public void reviseBook(Book book, Book userBook) {
        book.setTitle(userBook.getTitle());
        book.setAuthor(userBook.getAuthor());
        book.setDate(userBook.getDate());
    }

    private boolean isBookEqual(Book book1, Book book2) {
        if(!book1.getTitle().equals(book2.getTitle()))
            return false;
        if(!book1.getAuthor().equals(book2.getAuthor()))
            return false;
        if(!book1.getDate().equals(book2.getDate()))
            return false;

        return true;
    }
}
