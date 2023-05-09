public class Reverse {
    static int reverse(int n){
        int rev =0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
/**
 * @param A
 * @return
 */
static int [] reverse(int A[]) {
    int B[]=new int[A.length];
    for (int i=A.length-1, j=0; i>=0;i--,j++ )
    B[j]=A[i];
    return B;
}
public static void main(String args []) {
    int i[]= {24,3451,6,51,31,};
    for (int x: i){
        System.out.println(reverse(x)); 
    }
}
}

