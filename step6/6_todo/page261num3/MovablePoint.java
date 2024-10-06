package page261num3;

public class MovablePoint extends Point {
    private int xSpeed, ySpeed;

    public String toString(){
        return "좌표 : (" + getX() + ", " + getY()+"), " + "x의 속도 : " + xSpeed +", y의 속도 : " + ySpeed;
    }

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
}
