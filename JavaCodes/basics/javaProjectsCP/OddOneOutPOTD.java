// Given an array of integers arr[] where, 
//every element appears thrice except for one which occurs once.
//Find that element which occurs once. 

/*geekforgeeks : https://www.geeksforgeeks.org/problems/find-element-occuring-once-when-
all-other-are-present-thrice/1?_gl=1*1xlm0kt*_up*MQ..*_gs*MQ..&gclid=CjwKCAjwwqfABhBcEiwA
ZJjC3j46YG0P0wRJMXEDX1UDL7JXHjtW33iXTo7_it80hSa8mY870T0_zhoCtWwQAvD_BwE&gbraid=0AAAAAC9yB
kDqLQjO9BONlOTP_a_a6SZDV */

import java.util.Arrays;
public class OddOneOutPOTD{
    public static void main(String[] args){
        int[] arr = {1,10,1,1};
        int ans = getSingle(arr);
        System.out.println(ans);
        

    }
    static int getSingle(int[] arr) {
        // code here 
        // we can use the hashmap and the 
        // bit manipulation or bit masking techiques 
        // will comeback to the qyestion when i learn about both of them.

        Arrays.sort(arr);
        for(int i = 0; i<arr.length-2; i+=3){
            if(arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
        
    }
    
}