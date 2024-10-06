package page263num6;

public class Car extends Vehicle {
    int displacement; // 자동차 배기량
    int gears; // 자동차 기어 단수

    void show(){
        System.out.println("Color: " + super.color + ", Speed: " + super.speed + ", Displacement: " + displacement + ", Gears: " + gears);
    }

    public Car(String color, int speed, int displacement, int gears){
        super(color, speed);
        this.displacement = displacement;
        this.gears = gears;
    }
}
