package com.company;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        LibrarianImpl librarianimpl = new LibrarianImpl();
        User user = new User();

        while(true)
        {
            switch(user.inputMenu())
            {
                case "제목으로 찾기" :{
                    Book bookFounded;
                    bookFounded = librarianimpl.findBookByTitle(user.inputTitle(), library.getBookList());
                    if (bookFounded == null) {
                        System.out.println("일치하는 책이 없습니다.");
                    }
                    else{
                        librarianimpl.printBookInfo(bookFounded);
                        System.out.println("출력되었습니다");
                    }
                    break;
                }
                case "책 추가":{
                    librarianimpl.addBook(user.createBook(), library.getBookList());
                    System.out.println("추가되었습니다.");
                    break;
                }
                case "책 제거": {
                    Book bookWillBeRemoved;
                    bookWillBeRemoved = librarianimpl.findBookByTitle(user.inputTitle(), library.getBookList());

                    if (bookWillBeRemoved == null) {
                        System.out.println("제거할 책이 존재하지 않습니다.");
                    } else {
                        librarianimpl.removeBook(bookWillBeRemoved, library.getBookList());
                        System.out.println("제거되었습니다.");
                    }
                    break;
                }
                case "책 수정":{
                    Book bookWillBeRevised;
                    bookWillBeRevised = librarianimpl.findBookByTitle(user.inputTitle(), library.getBookList());

                    if (bookWillBeRevised == null) {
                        System.out.println("수정할 책이 존재하지 않습니다.");
                    } else {
                        librarianimpl.reviseBook(bookWillBeRevised, user.createBook());
                        System.out.println("수정되었습니다.");
                    }
                    break;
                }
                case "종료": {
                    System.out.println("시스템이 종료되었습니다.");
                    return;
                }
                default:{
                    System.out.println("존재하지 않는 메뉴입니다.");
                    break;
                }
            }
        }
    }
}
