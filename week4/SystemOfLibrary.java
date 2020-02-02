package com.company;

public class SystemOfLibrary {

    public void start() {
        Library library = new Library();
        LibrarianImpl librarianImpl = new LibrarianImpl();
        User user = new User();
        Book bookFoundByTitle;

        while (true) {
            switch (user.input()) {
                case "제목으로 찾기":
                    bookFoundByTitle = librarianImpl.findBookByTitle(user.inputTitle(), library.getBookList());
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
                    bookFoundByTitle = librarianImpl.findBookByTitle(user.inputTitle(), library.getBookList());
                    if(bookFoundByTitle != null) {
                        librarianImpl.removeBook(bookFoundByTitle, library.getBookList());
                        System.out.println("제거 되었습니다.");
                    }
                    else {
                        System.out.println("제거할 책이 존재하지 않습니다.");
                    }
                    break;

                case "책 수정" :
                   String title = user.inputTitle();
                   bookFoundByTitle = librarianImpl.findBookByTitle(title, library.getBookList());
                    if (bookFoundByTitle != null) {
                        Book tempBookForFix = user.createBook();
                        librarianImpl.reviseBook(bookFoundByTitle, tempBookForFix);
                        System.out.println("수정 되었습니다.");
                    } else {
                        System.out.println("수정할 책이 존재하지 않습니다.");
                    }
                    break;

                case "종료":
                    System.out.println("시스템이 종료되었습니다.");
                    return;
            }
        }
    }
}
