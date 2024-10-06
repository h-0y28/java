package page260num1;

public class Cirlcle {
    protected int radius;
    void show(){
        System.out.printf("반지름이 %d인 원이다.\n", radius);
    }
    Cirlcle(int radius){
        this.radius = radius;
    }
}
