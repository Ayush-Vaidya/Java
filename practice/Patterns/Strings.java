package Strings;

public class Strings {
    public static void PrintLetters(String str) {
        for(int i=0;i<str.length();i++){
        System.out.print(str.charAt(i) + " ");
    }
    System.out.println();  
}

public static boolean PalindromeString(String str) {
    for(int i = 0; i<str.length()-1;i++){
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }

    }
    return true;
    
}

public static float getShortestPath(String path) {
    int x=0,y=0;
    for(int i=0; i< path.length();i++){
        char dir=path.charAt(i);
        //south
        if(dir=='S'){
            y--;
        }
        else if(dir=='N'){
            y++;
        }
        else if(dir=='E'){
            x++;
        }
        else if(dir=='W'){
            x--;
        }
    }   
    int X2=x*x;
    int Y2=y*y;
    return (float)Math.sqrt(Y2+X2);
}

public static String subString(String str, int si, int ei) {
    String substr="";
    for(int i =si; i<ei;i++){
        substr+=str.charAt(i);
    }
    return substr;
    
}
public static int longestString(String arr[]) {
    int maxlen= Integer.MIN_VALUE;
    int currVal=0;
    for(int i=0;i<arr.length;i++){
        currVal=arr[i].length();
        if(currVal>maxlen){
            maxlen=currVal;
        }

    }
    return maxlen;
}

public static void toUpperCase (String str) {
    StringBuilder sb=new StringBuilder("");
    for(int i=1; i<str.length();i++){
        if(str.charAt(i)==' '){
            sb.append (str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        } 
    }        
}

    public static void main(String args[]) {
        // char arr[]= {'a', 'b','c','d'};
        // String str="abcd";
        // String str2 = new String("xyz@#1234");
        // //Strings in JAVA are IMMUTABLE(Cannot be changed)

        // Scanner sc=new Scanner(System.in);
        // String name = sc.next();
        // System.out.println(name);
        // String fulname="Tony Stark";
        // System.out.println(fulname.length());

        //concatenation
        // String firstName ="Ayush ";
        // String lastName = "Vaidya";
        // String str= "racecar";

        // String fullname=firstName+lastName;
        // System.out.println(fullname.charAt(6));
        // PrintLetters(fullname);
        // PalindromeString(str);
        // System.out.println(PalindromeString(str));
        // String path = "WNEENESENNN";

        // System.out.println(getShortestPath(path));
        // String fruit[]={"apple","mango", "banana"};
        // System.out.println(longestString(fruit));
        // // System.out.println(subString(str, 0, 10));
        // String largest=fruit[0];
        // for(int i=1; i<fruit.length;i++){
        //     if(lar gest.compareTo(fruit[i])<0){
        //         largest = fruit[i];
        //     }
        // }
        // System.out.println(largest);
    StringBuilder sb= new StringBuilder("");
    for(char ch='a'; ch<='z'; ch++){
        sb.append(ch);
    }
    System.out.println(sb);
    
    }


    
}
