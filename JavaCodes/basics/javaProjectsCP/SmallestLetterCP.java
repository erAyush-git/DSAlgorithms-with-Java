//You are given an array/list of characters letters that is sorted in non-decreasing order, 
//and a character target. There are at least two different characters in letters.
//Return the smallest character in letters that is lexicographically greater than target. 
//If such a character does not exist, return the first character in letters.

//leetcode :https://leetcode.com/problems/find-smallest-letter-greater-than-target/

import java.util.Arrays;
public class SmallestLetterCP {
    public static void main(String[] args){
        char[] ch = {'a','c','e','f','k'};
        System.out.println(Arrays.toString(ch));
        System.out.println(nextGreatestLetter(ch, 'e'));
        

    }
    static char nextGreatestLetter(char[] letters, char target){
        int start = 0; 
        int end = letters.length -1;

        while(start<=end){
            int mid = start + (end - start)/2;
            /* see guru if target < mid tb to ek he 
            move hoga and else case me dono cover ho jyega
            ....but in our program we arge going with just greater number 
            so we have to surpass the == case like when target == mid it should 
            move in the right direction, so here we are using >= movement.*/ 
            
            if (target >= letters[mid]) {                                             
            } else {
                end = mid -1;
            }

        }
        return letters[start%letters.length]; // to letters to wrap around.
    }
    
}
