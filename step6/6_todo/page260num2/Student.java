package page260num2;

public class Student extends Person {
    int number;

    void show(){
        System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %d]\n",name,age,number);
    }

    Student(String name, int age, int number) {
        super(name, age);
        this.number = number;
    }
}
