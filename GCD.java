public class GCD {
    int gcd(int m, int n){

        while (m!=n){
            if (m>n) m=m-n;
            else n=n-m;
        }
        return m;

    } 
    public static void main(String args[]) {
        GCD x=new GCD();
        System.out.println(x.gcd(393,291381));
    }
}
