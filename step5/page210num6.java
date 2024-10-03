
public class page210num6 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] reverse(int[] org) {
        for(int i = 0; i < org.length/2; i++) {
            int temp = org[i];
            org[i] = org[org.length - i - 1];
            org[org.length - i - 1] = temp;
        }
        return org;
    }
}
