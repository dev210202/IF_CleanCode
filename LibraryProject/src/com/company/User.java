package com.company;

import java.util.Scanner;

public class User {

    private Scanner sc = new Scanner(System.in);

    String inputMenu() {
        System.out.println("Menu : '제목으로 찾기', '저자로 찾기', '날짜로 찾기', '책 추가', '책 제거', '책 수정', '종료'");
        System.out.print("Enter Menu : ");
        return sc.nextLine();
    }

    public String inputTitle() {
        System.out.print("Enter Title: ");
        return sc.nextLine();
    }

    public Book createBook() {
        Book book = new Book();

        System.out.print("Enter Title : ");
        book.setTitle(sc.nextLine());

        System.out.print("Enter Author : ");
        book.setAuthor(sc.nextLine());

        System.out.print("Enter Date : ");
        book.setDate(sc.nextLine());

        return book;
    }

}
