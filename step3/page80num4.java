import java.util.Scanner;

public class page80num4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("초 단위 정수를 입력하세요 : ");
        int n = in.nextInt();

        int hour = n/3600;
        int min = n%3600/60;
        int sec = n%3600%60;

        System.out.println(hour + ":" + min + ":" + sec);
    }
}
