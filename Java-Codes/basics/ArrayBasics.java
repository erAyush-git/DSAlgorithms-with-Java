// Arrays basics. 

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics{
    public static void main(String[] args){
         
        // datatype[] variable_name = new datatype[size];
        // or directly we can do it like : int[] rollno = {10,20,30,40,50}
        // array object may or may not be continious at the memory allocation.
        // always depends upon the jvm.

        int[] arr1 = new int[5];
        arr1[0]=5;
        arr1[1]=8;
        arr1[2]=29;
        arr1[3]=51;
        arr1[4]=78;
        System.out.println(Arrays.toString(arr1));  // .tostring() coverts the array to string.

        // Another method to declare an array is 
        int[] arr = {10,20,30,40,50};
        System.out.println(Arrays.toString(arr)); 

        Scanner input = new Scanner(System.in);
         
        // INPUT in Array from user with for loop
        int[] arrin = new int[5];
        String[] arrname = new String[3];

        // input for int 
        for(int i = 0;i<arrin.length;i++){
            arrin[i] = input.nextInt();
        }

        //input for string
        for(int x = 0; x < arrname.length;x++){
            arrname[x]=input.next();
        }

        // two methord of output are 
        // 1. Using loops -> a. for loop ; b. for each loop
        // 2. using Arrays.toString(---) methord 

        // OUTPUT WITH FOR LOOP.
        for(int num : arrin){
            System.out.print(num + " ");
        }

        for(String num : arrname){
            System.out.print(num + " ");
        }







        



    }
}