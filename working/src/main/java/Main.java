public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        User user = new User();

        while (true) {
            switch (user.inputOrder()) {
                case "search":
                    library.searchBook(user);
                    break;

                case "insert":
                    library.insertBook(user);
                    break;

                case "delete":
                    library.deleteBook(user);
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