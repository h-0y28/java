import java.util.Scanner;

public class page210num8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요일을 입력하세요. : ");
        String day = sc.nextLine();

        System.out.print(Days.valueOf(day.toUpperCase()));
        equarDay(day.toUpperCase());

    }

    public static void equarDay(String day){
        switch (day){
            case "MONDAY" :
                System.out.println("은 싫다");
                break;
            case "FRIDAY" :
                System.out.println("은 좋다");
                break;
            case "SATURDAY" :
            case "SUNDAY" :
                System.out.println("은 최고");
                break;
            default:
                System.out.println("은 그저 그렇다");
        }
    }
}

enum Days{
    MONDAY("월요일"), TUESDAY("화요일"), WENDSDAY("수요일"), THUERSDAY("목요일"), FRIDAY("금요일"), SATURDAY("토요일"), SUNDAY("일요일");

    private String s;

    Days(String s){
        this.s = s;
        
    }

    public String toString(){
        return s;
    }
}
