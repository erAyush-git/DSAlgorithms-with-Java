// Reversing an array using the swap funtion 
//the swap use start and end indices and swap them
// using two pointer methord
//start ++ while end--

import java.util.Arrays;
public class ReverseOfArray {
    public static void main(String[] args){
        int[] arr = {50,60,70,80,90};
        System.out.println(Arrays.toString(arr));
        SwaptillRev(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void SwaptillRev(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int s,int e){
        int temp = arr[e];
        arr[e] = arr[s];
        arr[s] = temp;
    }


    
}
