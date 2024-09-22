public class page123num5 {
    public static void main(String[] args) {
        int a=1,b=1,c=1;
        System.out.println("조건을 만족 시키는 변");

            for(int i=a;i<19;i++){
                for(int j=b;i+j<20;j++){
                    for(int k=c;i+j+k<20;k++){
                        if(i*i+j*j==k*k){
                            System.out.print("a : "+i+", b : "+j+", c : "+k+"\n");
                        }
                    }
                }
            }
        }
    }
