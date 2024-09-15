import java.util.Scanner;

public class page80num5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("소문자 입력1 : ");
        char ch = in.next().charAt(0);
        System.out.print("소문자 입력2 : ");
        String s = in.next();

        System.out.printf("대문자1 : %c\n", ch-32);
        System.out.printf("대문자2 : %s\n", s.toUpperCase());
    }
}
