package JavaCodes.arrays.arrayList;

import java.util.ArrayList;
public class ALContains {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(2);
        for(int i =0; i<100;i = i+ 13){
            list.add(i);
        }
        int target = 26;
        boolean found = contains(list, target);
        int index = getIndex(list, target);
        System.out.println(index);
    }

    static boolean contains(ArrayList<Integer> list , int target){
        boolean found = false;
        for(int x : list){
            if(x == target ) found = true;
        }
        return found;
    }

    static int getIndex(ArrayList<Integer> list , int value){
        int size = list.size();
        for (int x = 0 ; x <= size ; x++){
            if(list.get(x) == value) return x;
        }
        return -1;
    }
}
