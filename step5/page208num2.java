public class page208num2 {
    public static void main(String[] args) {
        System.out.println(sumExceptFirst(1,2,3,4));
        int[] arr = {2,3};
        System.out.println(sumExceptFirst(1, arr));
        System.out.println(sumExceptFirst(1,2,3,4,5));
    }

    public static int sumExceptFirst(int a, int ...v){
        int sum = 0;
        for(int i = 0 ; i < v.length ; i++){
            sum += v[i];
        }
        return sum;
    }
}
