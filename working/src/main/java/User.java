import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);

    public boolean isEntered() {
        return sc.hasNext();
    }

    public Book createBook() {
        Book book = new Book();

        System.out.print("제목을 입력하세요 : ");
        book.setTitle(sc.next());

        System.out.print("저자를 입력하세요 : ");
        book.setAuthor(sc.next());

        System.out.print("출간일을 입력하세요 : ");
        book.setDate(sc.next());

        return book;
    }

    public String input() {
        System.out.println("search/insert/delete/quit 중 수행하세요.");
        return sc.next();
    }

    public String inputTitle() {
        sc.nextLine();
        System.out.println("찾을 책의 제목을 입력하세요 : ");
        return sc.nextLine();
    }
}