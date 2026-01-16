//Binary Search s another serching thecnique 
// Sorted array dikha dimag lagana he nahi hai use BinarySearch pel do.

// way faster then Linear searching techinques.

//Define a mid element as mid = start + (end - start)/2
// closely watch where should target lie, if target > mid search in
//right side of the array and vice versa.

// Assumption : Array should be sorted and in this case 
// sorted in assending order.

import java.util.Arrays;
public class BinaraySearch {
    public static void main(String[] args){
        int[] arr = {1,3,5,23,56,89,91,96,98,100};
        System.out.println(Arrays.toString(arr));
        System.out.println(BSearch(arr, 100));

    }
    static int BSearch(int[] array ,int target){
        int start = 0;
        int end = array.length -1;

        while(start <= end){
            int MidElement = start + (end - start)/2;
            if(target > array[MidElement]){
                //end will be same, move start 
                start = MidElement+1;
            }else if(target < array[MidElement]){
                //start will remain same, move end 
                end = MidElement-1;
            }else {
                return MidElement;
            }     //if program comes till here, WWCD!
        }
        return -1; // if that elent is not found.

    }
    
}
