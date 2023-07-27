import java.util.*;
public class JavaBasic {

    public static int calculateSum(int num1, int num2){
        
        int sum = num1 + num2;
        return sum;

    }
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static int factorial(int n) {
        int f=1;
        for (int i=1; i <=n; i++){
            f*=i;
        }
        return f;
        
    }
    public static boolean isPrime(int n){
        if (n==2){  //corner case
            return true;
        }
        for (int i=2; i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void primeInRange(int n){
        for (int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print (i+" ");
            }

        }
        System.out.println();

    }


public static void binToDec(int binNum) {
    int myNum=binNum;
    int pow=0;
    int decNum=0;
    while (binNum>0){
        int lastDigit =binNum%10;
        decNum= decNum+(lastDigit* (int)Math.pow(2, pow));
        pow++;
        binNum=binNum/10;


    }
    System.out.println("decimal of "+ myNum+" = "+ decNum);
}
    public static void decToBin(int n){
        int myNum=0;
        int pow =0;
        int binNum=0;
        while (n>0){
            int rem =n%2;
            binNum=binNum+(rem*(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary form of "+myNum + " = "+ n+ binNum);
    }

    //Q1
    public static double avg(int a, int b, int c) {
        double d= (a+b+c)/3;
        return d;
        
    }
    //Q2
    public static boolean isEven(int a) {
        if(a%2==0){
            return true;
        }
        return false;
        
    }
//Q3
    public static boolean isPalindrome(int a) {
    
        int p=a;
        int rev=0;
        while(p!=0){
            int rem=p%10;
            rev=rev*10+rem;
            p=p/10;
        }        
        if (a==rev){
            return true;
        }
        return false;
    }

//Q5
public static int sumInt(int a) {
    int sum=0;
    while (a>0){
        int ld= a%10;
        sum+=ld;
        a/=10;
    }
    return sum;
}
public static void inv_Pyramid(int totrow , int totcol ){
    for (int i=1; i<=totrow;i++){
        for (int j = 1; j<=totcol-i; j++ ){
            System.out.println(" ");
            
        }
    }

}  
        

    public static void main(String [] args)  {
        
        binToDec(1011010101 );
        decToBin(51);
        System.out.println( avg(13,14, 15));
        System.out.println(isEven(14));
        System.out.println("Enter integer");
        Scanner sc=new Scanner(System.in);

        int p=sc.nextInt();
        System.out.println(isPalindrome(p));
        System.out.println(sumInt(12345));
        sc.close();

    }
}



