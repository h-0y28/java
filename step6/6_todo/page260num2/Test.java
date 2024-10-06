package page260num2;

public class Test {
    public static void main(String[] args) {
//        Person p = new Person("길동이", 22);
//        Student s = new Student("황진이", 23, 100);
//        ForeignStudent fs = new ForeignStudent("Amy", 30, 200, "U.S.A");
//
//        Person[] persons = new Person[] { p, s, fs };

        Person[] persons = {new Person("길동이", 22),new Student("황진이", 23, 100),new ForeignStudent("Amy", 30, 200, "U.S.A")};

        for(Person p : persons) {
            p.show();
        }
    }
}
