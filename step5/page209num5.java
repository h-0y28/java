//import java.util.Scanner;
//
//public class page209num5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int[] arr = new int[10];
//        int[] counts = new int[10];
//
//        System.out.println("숫자를 10개 입력하세요.");
//
//        for (int i = 0; i < 10; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < 10; i++) {
//            if (arr[i] >= 0 && arr[i] < 10) {
//                counts[0]++;
//            } else if (arr[i] >= 10 && arr[i] < 20) {
//                counts[1]++;
//            } else if (arr[i] >= 20 && arr[i] < 30) {
//                counts[2]++;
//            } else if (arr[i] >= 30 && arr[i] < 40) {
//                counts[3]++;
//            } else if (arr[i] >= 40 && arr[i] < 50) {
//                counts[4]++;
//            } else if (arr[i] >= 50 && arr[i] < 60) {
//                counts[5]++;
//            } else if (arr[i] >= 60 && arr[i] < 70) {
//                counts[6]++;
//            } else if (arr[i] >= 70 && arr[i] < 80) {
//                counts[7]++;
//            } else if (arr[i] >= 80 && arr[i] < 90) {
//                counts[8]++;
//            } else if (arr[i] >= 90 && arr[i] < 100) {
//                counts[9]++;
//            }
//        }
//
//        for (int i = 0; i <= 90; i += 10) {
//            System.out.printf("%d ~  %d : ", i, i + 9);
//            for (int j = 0; j < 10; j++) {
//                for (int k = 0; k < counts[j]; k++) {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
