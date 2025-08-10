/*Given a sorted array of distinct integers and a target value, 
return the index if the target is found. If not, return the index where it would be if it were inserted in order.
sorted in non-dec order
You must write an algorithm with O(log n) runtime complexity. 

leetcode : 35*/

public class searchInsertPosition {
    public static void main(String[] args) {
        
    }
    static int searchIndex(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target){
                end = mid -1;
            } else start = mid + 1;
        }
        return end+1;
    }
}
