import java.util.Scanner;
import java.util.Arrays;

public class trash{
    public static void main(String[] args) {
        int[] arr = {0,-32,-1,89,65,74,56};
        Selection(arr);
        System.out.println(Arrays.toString(arr));

    
    }
    static void Selection(int[] arr){
       for(int i =0;i<arr.length;i++){
         int lastindex= arr.length-1-i;
         int max = getmaxindex(arr);
         swapp(arr, max , lastindex);

        }

    }
    static int getmaxindex(int[] arr){
       int max = arr[0];
       for(int i = 0; i<arr.length;i++){
          if(arr[i]> arr[max]) {
          max = i;
          }
        }
        return max; // we got the index of the largest element
    }
    static void swapp(int[] arr , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end] ;
        arr[end] = temp;
    }
}
