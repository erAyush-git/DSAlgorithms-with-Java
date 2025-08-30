/*
You are a product manager and currently leading a team to develop a new product. 
Unfortunately, the latest version of your product fails the quality check.
 Since each version is developed based on the previous version, all the versions after a 
 bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, 
which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. 
Implement a function to find the first bad version. You should minimize the number of calls to the API. 

leetcode 278
*/

public class badVersion {
    public static void main(String[] args){

    }
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    /*public int firstBadVersion(int n) {
        // array defined 
        int[] arr = new int[n];
        for(int i =0; i <n ; i++){
            arr[i] = i+1;
        }
        // search for shit 
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isBadVersion(arr[mid])) end = mid -1;
            else if (!isBadVersion(arr[mid])) start = mid + 1;
            else return arr[mid];
        }
        return ans;
    }*/

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // array defined 
    
        // search for shit 
        int start = 1;
        int end = n;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            //if(isBadVersion(arr[mid])) end = mid -1;
            
            if (isBadVersion(mid)) {
                ans = mid; // this can be potnyial ans 
                end = mid -1;


            }
            else if (!isBadVersion(mid)) start = mid + 1;
           // else return arr[mid];
        }
        return ans;
        
    }

}
