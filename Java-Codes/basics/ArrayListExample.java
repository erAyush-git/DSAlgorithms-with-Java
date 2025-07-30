/* so the crazy thing about arraylist is that it consist 
 * of infinte never ending size 
 * means when we reach the half of assign size in arraylist 
 * it copy the whole aryy in a new array whose size is double 
 * form the last array so in this way it never ends 
 * .
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        
        list.add(50);
        list.add(56);
        list.add(63);
        list.add(23);
        list.add(25);

        boolean cheak = list.contains(56);
        System.out.println(list.contains(25));
        
        System.out.println(cheak);
        System.out.println(list);

        list.set(0, 95);
        System.out.println(list.size());
        System.out.println(list.indexOf(95));
        list.remove(3);
        System.out.println(list);


        //user input in arraylist
        for(int i = 0; i<5;i++){
            list.add(in.nextInt()); // output examination says ye last me add hota hai like append in py.
        }

        //get elemnt of any range
        for(int i = 0; i<9; i++){
            System.out.println(list.get(i));
        }

    }
    
}
