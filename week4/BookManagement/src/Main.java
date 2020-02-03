import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        Library library = new Library();
        LibrarianImpl librarian = new LibrarianImpl();
        User user = new User();

        while (user.isEntered()) {
            switch (user.input()) {
                case "제목으로 찾기": {
                    String title = user.inputTitle();
                    ArrayList<Book> bookList = library.getBookList();
                    Book book = librarian.findBookByTitle(title, bookList);
                    if (isExistBook(book)) {
                        System.out.println("해당하는 제목의 책이 존재합니다. \n");
                        librarian.printBookInfo(book);
                        System.out.println("출력되었습니다.\n");
                    } else {
                        System.out.println("일치하는 책이 없습니다.\n");
                    }
                    break;
                }
                case "책 추가": {
                    Book book = user.createBook();
                    ArrayList<Book> bookList = library.getBookList();
                    librarian.addBook(book, bookList);
                    System.out.println("추가되었습니다.\n");
                    break;
                }
                case "책 제거": {
                    String title = user.inputTitle();
                    ArrayList<Book> bookList = library.getBookList();
                    Book book = librarian.findBookByTitle(title, bookList);
                    if (isExistBook(book)) {
                        System.out.println("해당하는 제목의 책이 존재합니다. \n");
                        librarian.removeBook(book, bookList);
                        System.out.println("제거되었습니다.\n");
                    } else {
                        System.out.println("제거할 책이 존재하지 않습니다\n");
                    }
                    break;
                }
                case "책 수정": {
                    String title = user.inputTitle();
                    String author;
                    String date;
                    ArrayList<Book> bookList = library.getBookList();
                    Book book = librarian.findBookByTitle(title, bookList);
                    if (isExistBook(book)) {
                        System.out.println("해당하는 제목의 책이 존재합니다. \n");
                        Book userBook = user.createBook();
                        librarian.reviseBook(book, userBook);
                        System.out.println("수정되었습니다.\n");
                    }
                    else {
                        System.out.println("수정할 책이 존재하지 않습니다\n");
                    }
                    break;
                }
                case "종료": {
                    System.out.println("시스템을 종료합니다.\n");
                    return;
                }
                default:
                    System.out.println("잘못 입력하셨습니다!\n");
            }
        }


    }

    private static boolean isExistBook(Book book) {
        if (book == null) {
            return false;
        }
        else {
            return true;
        }
    }
}
