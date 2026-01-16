
/*user input and giving output */
import java.util.Scanner;
import java.util.Arrays;


public class InputTDArr {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rowsize = input.nextInt();
        int colsize = input.nextInt();
        int[][] arr = new int[rowsize][colsize];

        //getting input
        for(int row = 0; row < arr.length; row++){
            for(int col=0; col< arr[row].length;col++){
                arr[row][col]=input.nextInt();
            }        
        }

        //giving output
        for(int row = 0; row < arr.length; row++){
            for(int col=0; col< arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
        }

        //giving output with for-each loop
        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
         





    }
}
