package page260num2;

public class ForeignStudent extends Student {
    String country;

    void show(){
        System.out.printf("외국 학생[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]\n",name,age,number, country);
    }

    ForeignStudent(String name, int age, int number, String country){
        super(name, age, number);
        this.country = country;
    }
}
