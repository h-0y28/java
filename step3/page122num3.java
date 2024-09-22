import java.util.Scanner;

public class page122num3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        do{
            System.out.print("양의 정수를 입력하세요 : ");
            int num = in.nextInt();

            // 입력값이 음수일시 반복문 종료
            if(num < 0){
                break;
            }

            // 조건
            if(num % 2 == 0){
                sum += num;
            }
        }while(true);

        // 출력
        System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
    }
}
