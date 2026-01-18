package JavaCodes.arrays;

public class RunningSum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int ans = sum2(arr);
        System.out.println(ans);
    }
    static int sum1(int[] arr){
        int rsum = 0;
        for ( int x : arr){
            rsum += x;
        }
        return rsum;
    }
    static int sum2(int[] arr){
        int sum =0;
        for(int i =0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }
}
