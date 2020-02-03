import java.util.ArrayList;

public class LibrarianImpl implements Librarian {
    @Override
    public Book findBookByTitle(String title, ArrayList<Book> bookList) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void printBookInfo(Book book) {
        System.out.println("책 제목 : " + book.getTitle());
        System.out.println("책 저자 : " + book.getAuthor());
        System.out.println("책 출판일 : " + book.getDate());
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
        book.setTitle(userBook.getTitle());
        book.setAuthor(userBook.getAuthor());
        book.setDate(userBook.getDate());
    }

}
