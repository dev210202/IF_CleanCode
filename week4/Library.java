package com.company;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookList = new ArrayList<>();

    private Book oldFuture = new Book();
    private Book dataStructure = new Book();
    private Book mind = new Book();
    private Book redAndBlack = new Book();

    public Library() {
        oldFuture.setTitle("오래된 미래");
        oldFuture.setAuthor("헬레나");
        oldFuture.setDate("1991");
        bookList.add(oldFuture);

        dataStructure.setTitle("데이터구조론");
        dataStructure.setAuthor("국형준");
        dataStructure.setDate("2012");
        bookList.add(dataStructure);

        mind.setTitle("마음");
        mind.setAuthor("나쓰메");
        mind.setDate("1914");
        bookList.add(mind);

        redAndBlack.setTitle("적과 흑");
        redAndBlack.setAuthor("스탕달");
        redAndBlack.setDate("1830");
        bookList.add(redAndBlack);
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }
}