// stagging change from vs code directly this 
//is a sample commit run.

/*You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.*/

//leetcode 744

public class smallestLetter {
    public static void main(String[] args) {
        
    }
    static char nextGreatestLetter(char[] letters, char target) {
        //Applying binary search over the array and 
        //not need for order digonstics as it alr given asc 

        int start = 0;
        int end = letters.length -1;

        while (start <= end){
            int middleElement = start + (end-start)/2;
            if(letters[middleElement] > target){
                end = middleElement -1;
            }else{
                start = middleElement +1;
            }
        }
        // % will help for letter to wrap 
        return letters[start%letters.length];
    }
}

