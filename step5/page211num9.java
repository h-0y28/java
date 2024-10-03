import java.util.Scanner;

public class page211num9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr;
        printMenu();

        System.out.print("m값을 입력하세요. : ");
        int m = sc.nextInt();
        System.out.print("n값을 입력하세요. : ");
        int n = sc.nextInt();

        arr = new char[m][n];

        System.out.print("p값을 입력하세요. : ");
        double p = sc.nextDouble();
        System.out.println();

        createBomb(m, n, p, arr);
        print(m, n, arr);
        printWithNumber(m, n, arr);
    }

    public static void printMenu(){
        System.out.println("m : 세로 길이");
        System.out.println("n : 가로 길이");
        System.out.println("p : 원소에 지뢰가 있을 확율 (0~1)");
        System.out.println("* : 지뢰O, - : 지뢰X");
        System.out.println();
    }

    public static void createBomb(int m, int n, double p, char[][] arr) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.random() < p)
                    arr[i][j] = '*';
                else
                    arr[i][j] = '-';
            }
        }
    }

    public static void print(int m, int n, char[][] arr) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printWithNumber(int m, int n, char[][] arr) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == '-') {
                    int cnt = 0;

                    for (int x = i - 1; x <= i + 1; x++) {
                        for (int y = j - 1; y <= j + 1; y++) {
                            if (x >= 0 && x < m && y >= 0 && y < n && arr[x][y] == '*') {
                                cnt++;
                            }
                        }
                    }

                    System.out.print(cnt + " ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

}
