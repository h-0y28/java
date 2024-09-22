public class num3 {
    public static void main(String[] args) {
        Printer3 p = new Printer3(20, true);
        p.print(25);
        p.setDuplex(false);
//        p.getDuplex(); // 추가
        p.print(10);
    }
}

class Printer3{
    private int numOfPages;
    private boolean duplex;

    // 생성과 동시에 초기화
    public Printer3(int numOfPages, boolean duplex) {
        this.numOfPages = numOfPages;
        this.duplex = duplex;
    }

    public void print(int amount) {
        if(this.numOfPages == 0){
            System.out.println("용지가 없습니다. ");
        }
        if(this.duplex){
            amount = amount%2==0? amount/2 : amount/2+1;
            if(amount <= this.numOfPages){
                this.numOfPages-=amount;
                System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다. \n",amount,this.numOfPages);
            }else{
                int num = (this.numOfPages-amount)*-1;
                System.out.printf("양면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다. \n", num, amount-num);
                this.numOfPages=0;
            }
        }else{
            if(amount <= this.numOfPages){
                this.numOfPages-=amount;
                System.out.printf("단면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다. \n",amount,this.numOfPages);
            }else{
                int num = (this.numOfPages-amount)*-1;
                System.out.printf("단면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다. \n", num, amount-num);
                this.numOfPages=0;
            }
        }

    }

    public void getDuplex() {
        System.out.println(this.duplex);
    }
    public void setDuplex(boolean duplex){
        this.duplex = duplex;
    }
}
