import java.util.ArrayList;

public class LibrarianImpl implements Librarian {

    public void searchBook(User user, ArrayList<Book> bookList) {
        try {
            Book targetBook = findBookByTitle(user.inputTitle(), bookList);

            printBookInfo(targetBook);

            System.out.println("출력되었습니다.");

        } catch (NullPointerException npe) {
            System.out.println("일치하는 책이 없습니다.");
        }
    }

    public void insertBook(User user, ArrayList<Book> bookList) {
        Book book = user.createBook();
        addBook(book, bookList);

        System.out.println("추가되었습니다.");
    }

    public void deleteBook(User user, ArrayList<Book> bookList) {
        try {
            Book targetBook = findBookByTitle(user.inputTitle(), bookList);

            removeBook(targetBook, bookList);

            System.out.println("제거되었습니다.");

        } catch (NullPointerException npe) {
            System.out.println("제거할 책이 존재하지 않습니다.");
        }
    }

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

    }

    @Override
    public void printBookInfo(Book book) {
        System.out.println(book.toString());
    }
}
