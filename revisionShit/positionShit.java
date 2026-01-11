package revisionShit;

public class positionShit {
    public static void main(String[] args){

    }
    static int[] search(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0] = positionSearch(arr, target, true);
        if(arr[0] != -1) ans[1] = positionSearch(arr, target, false);

        return ans;

    }
    static int positionSearch(int[] arr, int target , boolean SearchForStart){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target) end = mid -1;
            else if(arr[mid] < target ) start = mid +1;
            else{
                // case of potential answer
                int ans = mid;
                if(SearchForStart) end = mid -1 ;
                else start = mid + 1;

            }
        }
        return ans;
    }
}
