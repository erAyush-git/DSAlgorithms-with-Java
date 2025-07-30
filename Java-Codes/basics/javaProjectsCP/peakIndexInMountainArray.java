/*You are given an integer mountain array arr of length n where the values increase to a
 peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity. */

//leetcode : https://leetcode.com/problems/peak-index-in-a-mountain-array/description/


public class peakIndexInMountainArray{
    public static void main(String[] args){
        int[] arr = {0,2,1,0};
        int ans = search(arr);
        System.out.println(ans);

    }
    static int search(int[] arr){
        int start = 0;
        int end = arr.length-1;

        
        while(start < end){
            int middle = start  + (end - start)/2;
            if(arr[middle] > arr[middle +1]){
                end = middle;
            }else if(arr[middle]<arr[middle +1]){
                start = middle +1;

            }
        }
        return start;
    }
}