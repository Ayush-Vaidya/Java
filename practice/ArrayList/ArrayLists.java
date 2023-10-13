package ArrayList;
import java.util.*;
public class ArrayLists {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp= list.get(idx1);
        list.set(idx1, idx2);
        list.set(idx2, temp);
    }


    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        //ascending order
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        //comparator
        System.out.println(list);

        // int idx1=1, idx2=3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);
        
        //get operation - O(1)
        // int element = list.get(2);
        // System.out.println(element);
        
        //Delete List element - O(n)
        // list.remove(2);
        // System.out.println(list);
        
        //set O - (n)
        // list.set(2, 10);
        // System.out.println(list);

        //Contains
        // System.out.println(list.size()); 

    }    
}
