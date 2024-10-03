public class page208num1 {
    public static void main(String[] args) {
        System.out.println(countChar("hello world", 'o'));
    }

    static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
