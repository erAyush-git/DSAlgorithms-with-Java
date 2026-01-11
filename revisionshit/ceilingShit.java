package revisionShit;

public class ceilingShit {
    public static void main(String[] args){
        int[] arr = {1,3,5,7,8,9};
        int ans = ceilingOfNumber(arr, 6);
        System.out.println(ans);
    }
    static int ceilingOfNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target ) return arr[mid];
            else if (arr[mid] > target) end = mid -1;
            else start = mid + 1 ;

        }
        return arr[start];
    }
}
