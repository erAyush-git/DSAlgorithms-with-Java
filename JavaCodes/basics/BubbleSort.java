
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5,9,8,7,4,0,-32,-1};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Bubble(int[] arr) {
        for(int i =0; i<arr.length;i++){
        //for every round of i there will be one element sorted and 
        //corrected to its position from last index 
          for (int j = 1; j < arr.length - i; j++) {
          //this j will go though every element and when its value got 
          //index out of bound then there will new loop value increment for i .
              if (arr[j] < arr[j-1]){
                 int temp = arr[j];
                 arr[j]=arr[j-1];
                 arr[j-1]=temp;
                }
            }
        }
    }
}
