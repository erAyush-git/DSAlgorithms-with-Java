
// Proggram to swap to distinct indices of an 
// wrt thier values.

import java.util.Arrays;
public class SwapInArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,8};
        System.out.println(Arrays.toString(arr));

        swap(arr,2,3);
        System.out.print(Arrays.toString(arr));

    }
    static void swap(int[] arr, int s,int e){
        int temp = arr[e];
        arr[e] = arr[s];
        arr[s] = temp;
    }
}
