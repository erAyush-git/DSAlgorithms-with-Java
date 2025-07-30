
//You are given an array arr[] of size n - 1 that contains distinct integers in the range 
//from 1 to n (inclusive). This array represents a permutation of the integers
 //from 1 to n with one element missing. 
 //Your task is to identify and return the missing element.

 // geekforgeeks : https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sortBy=submissions
 
 import java.util.Arrays;
 public class MissingNumberCP {
    public static void main(String[] args){
        int[] arr = {5,4,2,1};
        System.out.println(missingnum(arr));
        System.out.println(methordsum(arr, 5));

    }
    static int missingnum(int[] arr){
        Arrays.sort(arr);
        for(int i = 0; i<arr.length;i++){
            if((i+1) != arr[i]){
                return i+1;
            }
        }
        return arr[arr.length-1]+1;


    }
    static int methordsum(int[] arr,int n){
        int arrsum = 0 ;
        for(int i=0;i<arr.length;i++){
            arrsum = arrsum + arr[i];
        }
        int OriSum = (n*(n+1))/2;
        int missingint = OriSum - arrsum;

        return missingint;

    }
    
}
