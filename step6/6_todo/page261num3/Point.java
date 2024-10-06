package page261num3;

public class Point {
    private int x, y;

    // 접근자
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }

    public String toString(){
        return "좌표 : (" + x + ", " + y+  ")" ;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
