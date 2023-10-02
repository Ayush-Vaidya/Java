package ArrayList;

import java.util.ArrayList;

public class MostWater {
    // public static int storeWater(ArrayList<Integer> height){
    //     //O(n2)
    //     int maxWater=0;
    //     for(int i=0;i<height.size();i++){
    //         for( int j=i+1; j<height.size();j++){
    //             int ht = Math.min(height.get(i), height .get(j));
    //             int width = j-i;
    //             int currwater = ht* width;
    //             maxWater= Math.max(maxWater, currwater);
    //         }
    //     }
    //     return maxWater;
    // }

    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;
        while (lp<rp){
            //calculate
            int ht = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currWater = ht*width; 
            maxWater= Math.max(maxWater, currWater);

            //update
            if(height.get(lp)< height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String ars[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
    
}
