import java.util.Scanner;

public class page81num7 {
    public static void main(String[] args) {
        System.out.println("조건 1 : 4와 5로 나누어지는가?");
        System.out.println("조건 2 : 4또는 5로 나누어지는가?");
        System.out.println("조건 3 : 4나 5 중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는가?");
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = in.nextInt();

        // 조건 1
        if(num % 4==0 && num%5==0) {
            System.out.println("조건 1 : true");
        }else {
            System.out.println("조건 1 : false");
        }

        // 조건 2
        if(num % 4==0 || num%5==0) {
            System.out.println("조건 2 : true");
        }else {
            System.out.println("조건 2 : false");
        }

        // 조건 3
        if((num % 4==0 && num%5!=0) || (num % 4!=0 && num%5==0)) {
            System.out.println("조건 3 : true");
        }else {
            System.out.println("조건 3 : false");
        }
    }
}
