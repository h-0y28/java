import java.util.Scanner;

public class page80num2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int n = in.nextInt();

        System.out.printf("%d의 제곱은 %d", n, n*n);

        in.close();
    }
}
