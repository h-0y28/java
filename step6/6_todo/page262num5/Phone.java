package page262num5;

public class Phone {
    protected String owner;

    void talk(){
        System.out.println(owner+"가 통화 중이다. ");
    }

    Phone(String owner){
        this.owner=owner;
    }
}
