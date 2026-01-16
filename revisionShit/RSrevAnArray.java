package revisionShit;

import java.util.Arrays;

public class RSrevAnArray {
    public static void main(String[] args){
        int[] arr = {1,3,4,5,6,7};
        int mid = (arr.length-1)/2;

        int start = 0;
        while(start <= mid){
            swap(arr, start, (arr.length - start -1));
            start++;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr , int idx1 , int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
