package com.company;

public class SystemOfLibrary {

    public void start() {
        Library library = new Library();
        LibrarianImpl librarianImpl = new LibrarianImpl();
        User user = new User();

        while (true) {
            switch (user.input()) {
                case "제목으로 찾기":
                    Book bookFoundByTitle = librarianImpl.findBookByTitle(user.inputTitle(), library.getBookList());
                    if (bookFoundByTitle != null) {
                        librarianImpl.printBookInfo(bookFoundByTitle);
                        System.out.println("출력 되었습니다.");
                    } else {
                        System.out.println("일치하는 책이 없습니다.");
                    }
                    break;

                case "책 추가":
                    Book newBook = user.createBook();
                    librarianImpl.addBook(newBook, library.getBookList());
                    System.out.println("추가 되었습니다.");
                    break;

                case "책 제거":
                    Book foundBook = librarianImpl.findBookByTitle(user.inputTitle(), library.getBookList());
                    if(foundBook != null) {
                        librarianImpl.removeBook(foundBook, library.getBookList());
                        System.out.println("제거 되었습니다.");
                    }
                    else {
                        System.out.println("제거할 책이 존재하지 않습니다.");
                    }
                    break;


                case "종료":
                    System.out.println("시스템이 종료되었습니다.");
                    return;
            }
        }
    }
}
