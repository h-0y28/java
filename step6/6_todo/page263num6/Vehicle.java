package page263num6;

public class Vehicle {
    String color; // 자동차 색상
    int speed; // 자동차 속도

    void show(){
        System.out.println("Color: " + color + " Speed: " + speed);
    }

    public Vehicle(String color, int speed){
        this.color = color;
        this.speed = speed;
    }
}
