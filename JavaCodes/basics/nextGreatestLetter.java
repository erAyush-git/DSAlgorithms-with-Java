//You are given an array of characters letters that is sorted in non-decreasing order, and a character target. 
//There are at least two different characters in letters.

//Return the smallest character in letters that is lexicographically greater than target. 
//If such a character does not exist, return the first character in letters.

//leetcode 744 :https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/


public class nextGreatestLetter{
    public static void main(String[] args){
        char[] letters = {'c','f','j'};
        char ans = nextgreatestletter(letters, 'c');
        System.out.println(ans);

    }
    static char nextgreatestletter(char[] letters, char target){
        //Alraedy sorted in non-decending order 
        int start = 0;
        int end = letters.length -1;
        while(start <= end){
            int middleElement = start + (end - start)/2;
            if(letters[middleElement] > target){
                end = middleElement-1;
            }else{
                start = middleElement +1;
            }
        }
        return letters[start%letters.length];


    }

}