import java.util.Scanner;

public class page81num8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, sum = 0;

//         입력 받기 + 입력한 값이 조건에 만족하는지 확인
//        while(true){
//            System.out.print("0~999사이의 숫자를 입력하세요: ");
//            num = in.nextInt();
//            if(num > 0 && num < 999){
//                break;
//            }
//            System.out.println("잘못된 입력값 입니다. ");
//        }

        // 조건 없이 그냥 받을 때
        System.out.print("숫자를 입력하세요: ");
        num = in.nextInt();


        // 자릿수  합 구하기
        while(true){
            int i = 10;
            sum +=num%i;
            if(num/i==0){
                break;
            }
            num /=10;
        }

        // 출력
        System.out.printf("각 자릿수의 합 = %d", sum);
    }
}
