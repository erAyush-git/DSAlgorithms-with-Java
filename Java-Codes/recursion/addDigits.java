
//leetcode :258
public class addDigits {
    public static void main(String args[]){
        int num = 38;
        int ans = AddDigits(num);
        System.out.println(ans);
    }
     /* solved through resursion*/
    static int AddDigits(int num){
        int sum = 0;
        while(num != 0){
            int rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        if(sum<10) return sum;
        else return AddDigits(sum);
    }
}

            
