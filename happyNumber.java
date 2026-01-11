//leetcode 202
public class happyNumber {
    public static void main(String[] args) {
        int n = 2;
        boolean ans = isHappy(n);
        System.out.println(ans);
    }
    static boolean isHappy(int num){
        int squaredSum = 0 ;
        while(num > 0){
            int rem = num% 10;
            squaredSum = squaredSum+rem*rem;
            num = num / 10;
        }
        if(squaredSum != 1) return isHappy(squaredSum);
        // this methord might fall in endless loop for the unhappy much recursive number like 2.
        else if (squaredSum == 1) return true;
        return false;
        
    }
}
