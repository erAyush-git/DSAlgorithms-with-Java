package JavaCodes.arrays;

import java.util.Arrays;

public class elementCompare {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,5};
        int[] arr2 = {1,2,4,2};
        int[] ans = compare(arr1, arr2, 4);
        System.out.println(Arrays.toString(ans));
    }
    static int[] compare(int[] arr1, int[] arr2 ,  int arrSize){
        int s1 =0;
        int s2 =0;
        while(s1 < arrSize){
            if(arr1[s1] > arr2[2]) return arr1;
            s1++;
            s2++;
        }
        return arr2;
    }
}
