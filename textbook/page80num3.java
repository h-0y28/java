import java.util.Scanner;

public class page80num3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("원기둥의 밑면의 반지름은? ");
        double r  = in.nextDouble();

        System.out.print("원기둥의 높이는? ");
        double h  = in.nextDouble();

        System.out.printf("원기둥의 부피는 %.1f", r*r*h*3.14);

    }
}
