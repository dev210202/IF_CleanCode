package com.company;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookList = new ArrayList<>();

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookArrayList) {
        this.bookList = bookArrayList;
    }

    public Library(){
        bookList.add(new Book("책 제목", "이현주", "19980923"));
        bookList.add(new Book("Book title", "uhhyunjoo", "20200202"));
    }
}

