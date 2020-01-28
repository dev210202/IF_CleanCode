import java.util.ArrayList;

public interface Librarian {

    Book findBookByTitle(String title, ArrayList<Book> bookList);

    void printBookInfo(Book book);

    void addBook(Book book, ArrayList<Book> bookList);

    void removeBook(Book book, ArrayList<Book> bookList);

    void reviseBook(Book book, Book userBook);
}
