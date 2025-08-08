
//leetcode : 3285

import java.util.ArrayList;
import java.util.List;

public class indicesOfStableMountain {
    public static void main(String[] args) {
        
    }
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < height.length -1; i++){
            if(height[i] > threshold){
                list.add(i+1);
            }
        }
        return list;
    }

}
