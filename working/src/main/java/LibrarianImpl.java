import java.util.ArrayList;

public class LibrarianImpl implements Librarian {

    @Override
    public Book findBookByTitle(String title, ArrayList<Book> bookList) throws NullPointerException {

        Book matchingBook = null;

        for (Book tempBook : bookList) {

            String bookTitle = tempBook.getTitle();

            if (bookTitle.equals(title)) {
                matchingBook = tempBook;
            }
        }

        return matchingBook;
    }

    @Override
    public void addBook(Book book, ArrayList<Book> bookList) {
        bookList.add(book);
    }

    @Override
    public void removeBook(Book book, ArrayList<Book> bookList) {
        bookList.remove(book);
    }

    @Override
    public void reviseBook(Book book, Book userBook) {
        book.setDate(userBook.getDate());
        book.setAuthor(userBook.getAuthor());
        book.setTitle(userBook.getTitle());
    }

    @Override
    public void printBookInfo(Book book) {
        System.out.println(book.toString());
    }
}
