
/* There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
 The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude 
between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.*/ 

// leetcode 1732 : https://leetcode.com/problems/find-the-highest-altitude/description/
import java.util.ArrayList;
public class largestAltitude{
    public static void main(String[] args){

    }
    static int Solution(int[] gain){
        int highestAltitude = 0;
        int currentAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            highestAltitude = Math.max(highestAltitude, currentAltitude);
        }
        return highestAltitude;
    }
    static int Solution2(int[] gain){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        list.add(0); // Always starts from 0
        for(int num : gain){
            sum = sum + num;
            list.add(sum);
        }
        int max = Integer.MIN_VALUE;
        for(int nums : list){
            if(nums > max){
                max = nums;
            }
        }
        return max;
    }

    
}
