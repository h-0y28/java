public class num2 {
    public static void main(String[] args) {
        Printer2 p = new Printer2(10);
        p.print(2);
        p.print(20);
        p.print(10);
    }
}

class Printer2{
    private int numOfPages = 0;

    public void print(int amount){
        if(numOfPages == 0){
            System.out.println("용지가 없습니다. ");
        }
        else if(amount <= numOfPages){
            numOfPages-=amount;
            System.out.printf("%d장 출력했습니다. 현재 %d장 남아 있습니다. \n",amount,numOfPages);
        }else{
            int num = (numOfPages-amount)*-1;
            System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다. \n", num, amount-num);
            numOfPages=0;
        }
    }

    // 생성과 동시에 초기화
    public Printer2(int num){
        numOfPages=num;
    }
}