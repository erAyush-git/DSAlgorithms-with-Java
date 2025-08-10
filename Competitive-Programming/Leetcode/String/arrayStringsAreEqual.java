/*Given two string arrays word1 and word2, 
return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string. */

//leetcode:1662

public class arrayStringsAreEqual {
    public static void main(String[] args){
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a","bc"};
        boolean ans = equalStringWithArr(word1, word2);
        System.out.println(ans);
    }
    /*is slower methord*/
    static boolean equalString(String[] word1, String[] word2){
        String word1joined ="";
        String word2joined = "";
        for(String word : word1){
            word1joined += word;
        }
        for(String wordString : word2){
            word2joined += wordString;
        }
        if(word1joined.equalsIgnoreCase(word2joined)) return true;
        else return false;
    }
    static boolean equalStringWithArr(String[] word1, String[] word2){
        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        for(String word : word1){
            sb1.append(word);
        }
        for(String WordStr : word2){
            sb2.append(WordStr);
        }
        if (sb1.toString().equals(sb2.toString())) return true;
        else return false;
    }
    
}

