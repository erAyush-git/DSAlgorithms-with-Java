package revisionShit;

import java.util.Arrays;
import java.util.Scanner;
public class RSArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arry = {1,4,5,6,7,8};
        System.out.println(Arrays.toString(arry));

        //[input in array]
        int s = input.nextInt();
        int[] arr = new int[s];

        for(int i =0 ; i < s ; i++){
            arr[i] = input.nextInt();
        }

        //output for thre saame shit 
        for(int x =0; x < arr.length ; x++){
            System.out.println(arr[x]);
        }

        System.out.println(Arrays.toString(arr));
        Arrays.
    }

}
