/*Given an array nums. We define a running sum of an array as 
runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums */

import java.util.ArrayList;
public class runningSum {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        ArrayList ans = sumArr(nums);
        System.out.println(ans);
    }
    static ArrayList sumArr(int[] nums){
        ArrayList<Integer> newSum = new ArrayList<>();
        int sum = 0;
        for(int num : nums){
            sum += num;
            newSum.add(sum);
        }
        return newSum;
    }
}
