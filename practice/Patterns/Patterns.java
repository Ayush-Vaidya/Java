package pattern;

public class Patterns {
    public static void hollow_rectangle(int totrow,int totcol){
        //outer loop rows
        for (int i=1;i<=totrow;i++){
            //outer loop columns
            for (int j=1; j<=totcol;j++){
                if(i==1 || i== totrow || j==1 || j== totcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        }

    public static void inv_Pyramid_stars(int totrow , int totcol ){
        for (int i=1; i<=totrow;i++){
            //spaces
            for (int j = 1; j<=totrow -i; j++ ){
                System.out.print(" ");  
            }
            //stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inv_Pyramid_numbers(int n) {
        for (int i=n; i>0;i--){
            //spaces
            for (int j = 1; j<=i; j++ ){
                System.out.print(j);  
            }
            //stars
            for (int j=i;j<=j-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void floydsTriangle(int n) {
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

    }
    public static void triangle_01(int n) {
       for(int i=1; i <=n;i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1");//even
            }
            else{
                System.out.print("0");//odd
            }
            
        }
        System.out.println();
          
       } 
    }
    public static void butterfly(int n) {
        for (int i=1; i<=n;i++){
            for (int j = 1; j<=i;j++){
                  System.out.print("*");
            }
            
            for (int j = 1; j<=2*(n-i);j++){
                  System.out.print(" ");
            }
            
            for (int j = 1; j<=i;j++){
                  System.out.print("*");
            }
            System.out.println();
        }
        //2nd half

        for(int i=n;i>=1;i--){
            for (int j = 1; j<=i;j++){
                  System.out.print("*");
            }
            
            for (int j = 1; j<=2*(n-i);j++){
                  System.out.print(" ");
            }
            
            for (int j = 1; j<=i;j++){
                  System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void solidRhombus(int n) {
        for(int i=1; i<=n;i++){
            //spaces
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void tiltedRhombus(int n) {
        for(int i=1; i<=n;i++){
            //spaces
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 ||i==n || j==1 || j==n){
                    System.out.print ("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void DiamondPattern(int n){
          for(int i=1;i<=n;i++){
            //spacews
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
          }
          // second half
          for(int i=n;i>=1;i--){
            //spacews
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
          }
    }

    public static void main(String [] args) {
        // hollow_rectangle(5,5 );
        // inv_Pyramid_stars(6, 10);
        // inv_Pyramid_numbers(5);
        // floydsTriangle(5);
        // triangle_01(5);
        // butterfly(5);
        // solidRhombus(5);
        // tiltedRhombus(5);
        DiamondPattern(4);

        
    }
}
