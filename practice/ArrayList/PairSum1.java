package ArrayList;

import java.util.ArrayList;

public class PairSum1 {
    public static boolean pairSum (ArrayList<Integer> list, int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if((list.get(i)+list.get(j))== target){
                    return true;
                }
            }
        } 
        return false;
    }
    public static boolean pairSumOpt(ArrayList<Integer> list, int target){
        for(int i=0, j=list.size()-1; i<list.size();){
            if(list.get(i)+list.get(j)== target){
                return true;
            }
            else if(list.get(i)+list.get(j)<target){
                i++;
            }
            else if(list.get(i)+list.get(j)>target){
                j--;
            }
        }
        return false;

    }
     public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        int target=18;
        System.out.println(list);
        System.out.println(pairSumOpt(list, target)); 
    }
    
}
