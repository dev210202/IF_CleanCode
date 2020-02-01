public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        LibrarianImpl librarianImpl = new LibrarianImpl();
        User user = new User();

        while (true) {
            switch (user.input()) {

                case "search":
                    librarianImpl.searchBook(user, library.getBookList());
                    break;

                case "insert":
                    librarianImpl.insertBook(user, library.getBookList());
                    break;

                case "delete":
                    librarianImpl.deleteBook(user, library.getBookList());
                    break;

                case "quit":
                    System.out.println("시스템이 종료되었습니다");
                    return;

                default:
                    break;
            }
        }
    }
}