public class page124num9 {
    public static void main(String[] args) {
        foo("안녕", 1);
        foo("안녕하세요", 1,2);
        foo("잘 있어");
    }

    public static void foo(String s, int i) {
        System.out.println(s + " " + i);
    }
    public static void foo(String s, int i, int j) {
        System.out.println(s + " " + i + " " + j);
    }
    public static void foo(String s) {
        System.out.println(s);
    }
}