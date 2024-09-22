import java.util.Scanner;

public class page125num10 {
    public static void main(String[] args) {
        System.out.print("양의 정수를 입력하세요. : ");

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if(isPrime(num)) {
            System.out.println(num + "는 소수입니다.");
        }else {
            System.out.println(num + "는 소수가 아닙니다.");
        }
    }
    public static boolean isPrime(int num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}