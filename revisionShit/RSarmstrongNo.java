package revisionShit;

public class RSarmstrongNo {
    public static void main(String[] args){
        int n = 154;
        boolean ans = cheakArmStrong(n);
        System.out.println(ans);
    }
    static int cube(int num){
        return num*num*num; 
    }
    static boolean cheakArmStrong(int num){
        int numCubed = 0;
        int n = num;
        while(num != 0){
            int rem = num %10;
            numCubed += cube(rem);
            num=num/10;
        }
        if(n == numCubed){
            return true;
        }else return false;
    }
}
