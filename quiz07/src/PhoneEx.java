import java.util.Scanner;

public class PhoneEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("이름과 전화번호 입력");
    Phone first = new Phone(sc.next(), sc.next());
    System.out.println("이름과 전화번호 입력");
    Phone second = new Phone(sc.next(), sc.next());

    System.out.println(first.getName() + "의 번호 " + first.getTel());
    System.out.println(second.getName() + "의 번호 " + second.getTel());
  }
}
