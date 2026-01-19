package JavaCodes.arrays;

public class arrMax {
    public static void main(String[] args){
        int[] ar = {2,3,4,5,6,5,11};
        int max = maxValue(ar);
        System.out.println(max);
    }
    static int maxValue(int[] arr){
        int max = arr[0];
        for( int x : arr){
            if(x > max) max = x;
            
        }
        return max;
    }
}
