
import java.util.Arrays;
public class MinValArray {
    public static void main(String[] args){
        int[] arr = {30,56,478,-3,25,5};
        int ans = MinValue(arr);
        System.out.println(ans);

    }
    static int MinValue(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx] < min){
                min = arr[idx];
            }
            
        }
        return min;
    }
}
