public class page210num7 {
    public static void main(String[] args) {
        int[] a = {3,2,4,1,5};
        int[] b = {3,2,4,1};
        int[] c = {3,2,4,1,5};
        int[] d = {2,7,1,8,2};

        System.out.println("a와 b의 일치 여부 : "+compare(a,b));
        System.out.println("a와 c의 일치 여부 : "+compare(a,c));
        System.out.println("a와 d의 일치 여부 : "+compare(a,d));
    }

    public static boolean compare(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
