

public class patternPorblems {
    public static void main(String[] args){
        pattern05(5);
    }
    static void pattern03(int n){
        for(int row = 1; row <= n ; row++){
            for(int col = 1; col<=n - row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern04(int n){
        for(int row = 1; row <= n; row++){
            for(int col =1; col <= row ; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern05(int n){
        for(int row = 0; row < 2*n; row++){
            int totalNoOfCol = row > n ? 2*n - row : row ;

            for(int col = 0; col <totalNoOfCol ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern(int n){

    }
}
