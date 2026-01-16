//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ 
//customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all 
//their bank accounts. The richest customer is the customer that has the maximum wealth.

//leetcode : https://leetcode.com/problems/richest-customer-wealth/description/ 

public class MaxWealthCP {
    public static void main(String[] args ){
        int[][] arr = {
            {2,5,6,6,9},
            {261,68,489},
            {25,89,56,210},
        };
        System.out.println(wealth(arr));
          

    }
    static int wealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int customer = 0; customer<accounts.length;customer++){
            int rowsum = 0;
            for(int bank = 0; bank<accounts[customer].length;bank++){
                rowsum = rowsum + accounts[customer][bank];
            }
            if(ans<rowsum){
                ans = rowsum;
            }
        }
        return ans;
        
    }
    
}
