import java.util.Scanner;

public class page209num4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("URL을 입력하세요 : ");
            String url = sc.nextLine();

            if(url.endsWith("com")){
                System.out.println(url + "은 'com'으로 끝납니다. ");
            }

            if(url.contains("java")){
                System.out.println(url + "은 'java'를 포함합니다. ");
            }

            if(url.equals("bye")){
                break;
            }
        }
    }
}
