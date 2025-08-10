/*You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

leetcode 852*/



public class peakIndexInMountainArray {
   public static void main(String[] args) {
    
   } 
   static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int middleElement = start + (end - start)/2;
            if (arr[middleElement] > arr[middleElement +1]){
                end = middleElement;
            }else if(arr[middleElement] < arr[middleElement +1]){
                start = middleElement +1;
            }
        }
        return end;

    }
}

