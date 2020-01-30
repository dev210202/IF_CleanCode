import java.util.ArrayList;

public class Library {

    ArrayList<Book> bookList = new ArrayList<>();
    LibrarianImpl librarianImpl = new LibrarianImpl();


    public void searchBook(User user) {
        try {
            Book targetBook = librarianImpl.findBookByTitle(user.inputTitle(), bookList);

            librarianImpl.printBookInfo(targetBook);

            System.out.println("출력되었습니다.");

        } catch (NullPointerException npe) {
            System.out.println("일치하는 책이 없습니다.");
        }
    }

    public void insertBook(User user) {
        Book book = user.createBook();

        librarianImpl.addBook(book, bookList);

        System.out.println("추가되었습니다.");
    }

    public void deleteBook(User user) {
        try {
            Book targetBook = librarianImpl.findBookByTitle(user.inputTitle(), bookList);

            librarianImpl.removeBook(targetBook, bookList);

            System.out.println("제거되었습니다.");

        } catch (NullPointerException npe) {
            System.out.println("제거할 책이 존재하지 않습니다.");
        }
    }
}
