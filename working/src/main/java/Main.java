import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        ArrayList<Book> bookList = library.getBookList();
        LibrarianImpl librarianImpl = new LibrarianImpl();
        User user = new User();

        while (true) {
            switch (user.input()) {

                case "제목으로 찾기":
                    try {
                        Book targetBook = librarianImpl.findBookByTitle(user.inputTitle(), bookList);

                        librarianImpl.printBookInfo(targetBook);
                        System.out.println("출력되었습니다.");

                    } catch (NullPointerException npe) {
                        System.out.println("일치하는 책이 없습니다.");
                    }
                    break;

                case "책 추가":
                    Book book = user.createBook();

                    librarianImpl.addBook(book, library.getBookList());
                    System.out.println("추가되었습니다.");
                    break;

                case "책 제거":
                    try {
                        Book targetBook = librarianImpl.findBookByTitle(user.inputTitle(), bookList);

                        librarianImpl.removeBook(targetBook, bookList);
                        System.out.println("제거되었습니다.");

                    } catch (NullPointerException npe) {
                        System.out.println("제거할 책이 존재하지 않습니다.");
                    }
                    break;

                case "책 수정":
                    try{
                        Book targetBook = librarianImpl.findBookByTitle(user.inputTitle(), bookList);
                        Book resultBook = user.createBook();

                        librarianImpl.reviseBook(targetBook, resultBook);
                        System.out.println("수정되었습니다.");
                    }catch(NullPointerException npe){
                        System.out.println("수정할 책이 존재하지 않습니다.");
                    }
                    break;

                case "종료":
                    System.out.println("시스템이 종료되었습니다");
                    return;

                default:
                    break;
            }
        }
    }
}