package JavaCodes.arrays;

import java.util.Arrays;

public class arraySwap {
    public static void main(String[] args){
        int arr[] = {2,4,5,6,7};
        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int idx1 , int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
