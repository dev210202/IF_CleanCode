import java.util.Scanner;

public class User {

    Scanner sc = new Scanner(System.in);

    public boolean isEntered(){
        return sc.hasNext();
    }

    public Book createBook() {
        Book book = new Book();
        System.out.print("제목 : ");
        book.setTitle(sc.next());
        System.out.print("저자 : ");
        book.setAuthor(sc.next());
        System.out.print("날짜 : ");
        book.setDate(sc.next());
        sc.nextLine();
        return book;
    }

    public String input() {
        System.out.println("수행할 기능을 선택하세요");
        return sc.nextLine();
    }

    public String inputTitle() {
        System.out.println("제목을 입력하세요");
        return sc.nextLine();
    }

}