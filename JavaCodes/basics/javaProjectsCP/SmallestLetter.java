
//leetcode :https://leetcode.com/problems/find-smallest-letter-greater-than-target/

import java.util.Arrays;
public class SmallestLetter {
    public static void main(String[] args){
        char[] ch = {'a','c','e','f','k'};
        System.out.println(Arrays.toString(ch));
        System.out.println(nextGreatestLetter(ch, 'a'));
        

    }
    static char nextGreatestLetter(char[] letters, char target){
        int start = 0; 
        int end = letters.length;

        while(start<=end){
            int mid = start + (end - start)/2;
            if (target > letters[mid]) {
                start = mid +1;
            } else {
                end = mid -1;
            }

        }
        return letters[start%letters.length]; // to letters to wrap around.
    }
    
}
