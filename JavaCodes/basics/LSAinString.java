// search gor a perticular character at string array and sting only 
//make two diffrent function
//return index value if found otherwise return -1.

import java.util.Arrays;
public class LSAinString {
    public static void main(String[] args){

        // For String Array
        String[] arr = {"Ayush","kunal"};
        int ans = SearchStrArr(arr, "Ayushi");
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);

        // For Simple String
        String name = "Ayush";
        int res = SearchStr(name, 'u');
        System.out.println(name + " " + Arrays.toString(name.toCharArray()));
        System.out.println(res);

    }
    static int SearchStrArr(String[] arr,String target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    static int SearchStr(String names, char target){
        if(names.length() == 0){
            return -1;
        }
        /*for(char ch : names.toCharArray()){
            if(ch == target){
                return ch;
            }*/
        for(int i =0; i<names.length();i++){
            if(target == names.charAt(i)){
                return i;
            }
        }
        return -1;
    }
    
}
