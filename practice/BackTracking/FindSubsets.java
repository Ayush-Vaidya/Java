package BackTracking;

public class  FindSubsets {

    public static void findSets(String str, String ans, int i ){
        // Base case
        if(i== str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        // Recursion
        //Yes choice
        findSets(str, ans+str.charAt(i), i+1);
        //No choice
        findSets(str, ans, i+1);
    }

    public static void main(String[] args){
        String str= "abc";
        findSets(str, " ", 0);
    }
    
}
