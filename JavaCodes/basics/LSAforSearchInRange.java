public class LSAforSearchInRange {
    public static void main(String[] args){
        int[] arr = {2,5,6,8,9,7,4,5,6,7,41};
        System.out.println(SearchRange(arr, 10, 6, 9));
        System.out.println(SearchRange(arr, 41, 0, arr.length));



    }
    static int SearchRange(int[] arr, int target, int start ,int end){
        if(arr.length ==0){
            return -1;
        }
        for( int i = start; i< end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
