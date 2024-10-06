package page262num5;

public class Telephone extends Phone {
    private String when;

    void autoAnswering(){
        System.out.println(super.owner + "가 없다. " + when + "전화 줄래. ");
    }

    Telephone(String owner, String when){
        super(owner);
        this.when = when;
    }
}
