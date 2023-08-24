package Recursion;

public class Recursion {
    public static void main(String[] args){
        // int arr[]={1,2,23,4,2,1,4,5,7,8,7,51,2,3,2,1,5,35};
        // System.out.println(lastOcc(arr, 23,arr.length-1));
        // System.out.println(firstOcc(arr, 23, 0));
        // System.out.println(pow(2, 10));
        // System.out.println((int)Math.pow(2, 10));
        // System.out.println(OptPow(2,10));
        // printDigits(123456789);
        // String str="abcde";
        // System.out.println(length(str));
        System.out.println(tilingProblem(4));
        // String str="appnnacollege";
        // rmvDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendsPairing(3));


    }

    public static int friendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        
        return friendsPairing(n-1) +(n-1)*friendsPairing(n-2);
        
    }


    public static void rmvDuplicate(String str, int idx, StringBuilder newstr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }

        char currChar= str.charAt(idx);
        if(map[currChar-'a']==true){
            rmvDuplicate(str, idx+1, newstr, map);
        }
        else{
            map[currChar-'a']=true;
            rmvDuplicate(str, idx+1, newstr.append(currChar), map);
        }          
    }


    public static int tilingProblem(int n){
        if(n==0||n==1){
            return 1;
        }  
        //vertical choice
        // int fnm1= tilingProblem(n-1);
        // int fnm2= tilingProblem(n-2);
        // int totWays= fnm1+fnm2;
        // return totWays;
        return tilingProblem(n-1)+tilingProblem(n-2);
    }

    public static int length(String str){
        if(str.length()==0){
            return 0;
        }
        return length(str.substring(1))+1;
    }

    public static void printDigits(int num){
        String digits[]={"zero","one","two","three","four","five","six", "seven", "eight", "nine"};

        if(num==0){
            return;
        }
        int lastdigit=num%10;
        printDigits(num/10);
        System.out.print(digits[lastdigit]+" ");

    }

    public static void allOcc(int arr[], int k, int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==k){
            System.out.print(i+" ");
        }
        allOcc(arr, k, i+1);
    }

    public static int OptPow(int a, int n){
        if(n==0){
            return 1;

        }   
        int halfpow= OptPow(a, n/2);     
        int halfPowerSq=halfpow*halfpow;
        if(n%2!=0){
            halfPowerSq= a*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
           return false;
        }
        return isSorted(arr, i+1);
    }
    public static int pow(int x, int n){
        if(n==0){
            return 1;
        }
        return x*pow(x, n-1);

    }

    public static int firstOcc(int arr[], int k, int i){
        if(arr[i]  ==k){
            return i;
        }      
        return firstOcc(arr, k, i+1);

    }

     public static int lastOcc(int arr[], int k, int i){
        if(arr[i]==k){
            return i;
        }      
        return lastOcc(arr, k, i-1);

    }


    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn= fnm1+fnm2;
        return fn;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        } 
        int snm1=sum(n-1);
        int sn= n+snm1;
        return sn;
    }
    public static void fibonacci(int n){
        int n1=0, n2=1;
        System.out.print(n1+" "+n2);
        for(int i=1; i<=n;i++){
            int n3= n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

    public static long fact(int n){
        if(n==0){
            return 1;
        }  
        long fnm1= fact(n-1);
          long fn=n*fnm1;
          return fn;

    }

    public static void printDec(int n){
        
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
        


    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
        
        
    }
    
}
