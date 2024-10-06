package page261num4;

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();

        // 필드는 재정의 X
        System.out.println(p.name); // 영조

        // 메소드는 재정의 O
        p.print(); // 사도세자
    }
}
