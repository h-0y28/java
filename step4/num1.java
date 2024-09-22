public class num1 {
    public static void main(String[] args) {
        Printer pages = new Printer();
        pages.print(30);
    }
}

class Printer {
    int numOfPapers = 100;

    public void print(int amount){
        numOfPapers -= amount;
        System.out.println(amount);
    }
}