package page262num5;

public class Test {
    public static void main(String[] args) {
        Phone [] phones = {new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이","갤러그")};

        for (Phone p : phones) {
            //System.out.println(p.getClass());
            if(p instanceof Telephone){
                ((Telephone) p).autoAnswering();
            } else if(p instanceof Smartphone) {
                ((Smartphone) p).playGame();
            }
            else p.talk();
        }
    }
}
