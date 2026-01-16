//Application of Binary Search.
//floor of the number we have to find the number equal or just greater then the target numvber.

// below we are doing order agnstic binary search ato fiind the exact number,
//but if not found we gpoing to return as per the conditions
// in this case retun start; 

import java.util.Arrays;
public class CelingNumber {
    public static void main(String[] args){
        int[] arr = {1,8,10,81};
        System.out.println(Arrays.toString(arr));

        System.out.println(CeilingBinaryNo(arr, 7));


    }
    static int CeilingBinaryNo(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid; // if element is found this should be return.
            }else {
                if(isAsc){
                    if(target > arr[mid]){
                        start = mid+1;
                    }else{
                        end = mid-1;
                    }
                }else {
                    if(target > arr[mid]){
                        end = mid-1;
                    }else {
                        start = mid +1;
                    }
                }
            }
        }
        return start; // while loop condition break and there shold a conditon where end < start 
                      // while the start is pointing to the cealing number.
    }
    
}
