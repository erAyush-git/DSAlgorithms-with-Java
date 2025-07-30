
import java.util.Arrays;


/* Here we are going with two or multi diamnsional array 
decleration : int[][] arr = new int[row size][collumn size]
 */


public class TDArrayIO {
    public static void main(String[] args) {
 
        // decleration of array directliy or we can use 
        // int[][] arr = new int[2][3]
        // arr[0][0] = 2 TO update and get elements filled there.

        int[][] exampleArr ={
            {2,5,6},
            {3,9,0}
        };
            // when we write int[][] arr = new int[2][3]
            // the size of the array is = size of row = 2
            // and total number of elements are 2*3.
            // above shown exampleArr is 2*3 array.

            //output with toString methord:
            for (int i = 0; i < exampleArr.length; i++) {
                System.out.println(Arrays.toString(exampleArr[i]));
            }     

            // output with for eachloop 
            for(int[] nums : exampleArr){
                System.out.println(Arrays.toString(nums));
            }

    }

}
