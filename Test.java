
class Test
{
    int max(int x, int y){
        if(x>y)
        return x;
        else
        return y;
    }
    public static void main (String args[]){
        int a=15, b=10;
        Test T=new Test();
        System.out.println(T.max(a, b));
    }
}