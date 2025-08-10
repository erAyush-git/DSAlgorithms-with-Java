/* leetcode 1095


(This problem is an interactive problem.)

You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.*/

//Solution of Leetcode 1095

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findingPeakElement(mountainArr);
        int firstHalfTry = OrderAgnosticBS(mountainArr,target,0,peak,true);
        int endIndex = mountainArr.length()-1;
        if(firstHalfTry != -1){
            return firstHalfTry;
        }else{
            return OrderAgnosticBS(mountainArr,target,peak+1,endIndex,false);
        }
    }

    // This would help us to devide the array 
    //into two halfs and if we conqureoir one part then our ans lies in that only
    public int findingPeakElement(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length() -1;

        while (start < end){
            int middleElement = start + (end - start)/2;
            if(mountainArr.get(middleElement) > mountainArr.get(middleElement+1)){
                end = middleElement;
            }else if(mountainArr.get(middleElement) < mountainArr.get(middleElement +1)){
                start = middleElement +1;
            }
        }
        return start;
    }
    public int OrderAgnosticBS(MountainArray mountainArr, int target , int start , int end , boolean isAsc){
        while(start <= end){
            int middleElement = start + (end - start)/2;
            if(mountainArr.get(middleElement)==target){
                return middleElement;
            }else{
                if(isAsc){
                    //We are in the Assending part of the array
                    if(mountainArr.get(middleElement)>target){
                        end = middleElement -1;
                    }else{
                        start = middleElement +1;
                    }
                }else{
                    //Decending part of the array
                    if(mountainArr.get(middleElement)>target){
                        start = middleElement +1;
                    }else{
                        end = middleElement-1;
                    }
                }
            }
        }
        return -1;
    }
}
