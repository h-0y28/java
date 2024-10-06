package page262num5;

public class Smartphone extends Phone{
    private String game;

    void playGame(){
      System.out.println(super.owner+"가 " + game + " 게임을 하는 중이다.");
    }

    Smartphone(String owner, String game){
        super(owner);
        this.game = game;
    }
}
