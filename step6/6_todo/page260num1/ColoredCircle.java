package page260num1;

public class ColoredCircle extends Cirlcle{
    protected String color;
    void show(){
        System.out.printf("반지름이 %d인 %s 원이다 .\n",radius, color);
    }

    ColoredCircle(int radius,String color){
        super(radius);
        this.color = color;
    }
}
