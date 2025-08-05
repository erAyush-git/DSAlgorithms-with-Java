public class checkIfExist{
    public static void main(String[] args){
        int[] nums = {0,-2,2};
        boolean ans = cheak(nums);
        System.out.println(ans);
    }
    static boolean cheak(int[] arr){
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr.length ; j++){
                if(i != j){
                    if(arr[i] == 2*arr[j]) return true;
                }
            }
        }
        return false;
    }
}