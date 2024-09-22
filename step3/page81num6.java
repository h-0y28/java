import java.util.Scanner;

public class page81num6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("화씨 온도 입력 : ");
        double F = in.nextDouble();

        System.out.printf("%f", (F-32)*5/9);
    }
}
