package com.company;

import java.util.Scanner;

public class User {

    Scanner sc = new Scanner(System.in);

    public boolean isEntered(){
        return sc.hasNext();
    }

    public Book createBook() {
        Book book = new Book();
        book.setTitle(sc.next());
        book.setAuthor(sc.next());
        book.setDate(sc.next());
        return book;
    }

    public String input() {
        return sc.nextLine();
    }

    public String inputTitle() {
        return sc.nextLine();
    }

}