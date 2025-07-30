import java.util.Arrays;
public class passingArraytomain {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        System.out.println(Arrays.toString(arr));
        int[] newarr = change(arr);
        System.out.println(Arrays.toString(newarr));

    }
    static int[] change(int[] arr){
        arr[0]=60;
        arr[3]=10;
        return arr;
    }
}
