import java.util.Scanner;

public class page202num2 {
    public static void main(String[] args) {
        int numOfStudents = 0;
        int[] scores;
        String grade;
        Scanner in = new Scanner(System.in);

        System.out.print("학생수? ");
        numOfStudents = in.nextInt();
        scores = new int[numOfStudents];

        System.out.print(numOfStudents + "명의 학생 성적을 입력하세요.");
        for(int i=0; i<numOfStudents; i++){
            scores[i] = in.nextInt();
        }

        System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
        for(int i=0; i<numOfStudents; i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        for(int i=0; i<numOfStudents; i++){
            if(scores[i] >= 90){
                grade = "A";
            }else if(scores[i] >= 80){
                grade = "B";
            }else if(scores[i] >= 70){
                grade = "C";
            }else if(scores[i] >= 60){
                grade = "D";
            }else {
                grade = "E";
            }

            System.out.printf("%d번 학생의 등급은 %s입니다.\n", i+1, Grade.valueOf(grade));
        }
    }
}

enum Grade {
    A("최우수"), B("우수"), C("보통"), D("미흡"), F("탈락");
    private String s;

    Grade(String s){
        this.s = s;
    }

    public String toString() {
        return s;
    }
}
