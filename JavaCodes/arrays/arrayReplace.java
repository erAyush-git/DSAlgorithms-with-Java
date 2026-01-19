package JavaCodes.arrays;

import java.util.Arrays;

public class arrayReplace {
    public static void main(String[] args){
        int[] arr = {2,3,4,5};
        arr = rep(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static int[] rep(int[] arr, int indx , int value){
        arr[indx] = value;
        return arr;
    }
    
}
