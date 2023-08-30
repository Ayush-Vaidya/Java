package Matrices;
public class Matrices {

    public static void printSpiral(int matrix[][]) {
        int startRow=0;
        int startCol=0;
        int endRow = matrix.length-1;
        int endCOl= matrix[0].length-1;

        while (startRow<=endRow && startCol<=endCOl){
            //Top boundary
            for(int j=startCol;j<=endCOl;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right boundary
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCOl]+" ");
            }
            //bottom
            for(int j=endCOl-1;j>=startCol;j--){
                if( startCol==endCOl){
                    break;
                }
                System.out.print(matrix [endRow][j] + " ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startRow== endRow){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCOl--;
            endRow--;
            
        }
        System.out.println();
    }
    public static int diagonalSum(int matrix[][]) { //O(n^2)
        int sum=0;
        // for(int i=0; i<matrix.length;i++){
        //     for(int j=0; j< matrix.length;j++){
        //         if(i==j){
        //             sum +=matrix[i][j];
        //         }
        //         if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        for(int i=0; i<matrix.length;i++){//O(n)
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!=matrix.length-1-i){
                sum+= matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    public static boolean searchSortedMatrix(int matrix [][], int key) {
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        while(m< matrix.length && n>=0){
            if(matrix[m][n]== key){
                System.out.println("found key at ("+m+", "+n+")" );
                return true;
            }
            else if(key<matrix[m][n]){
                n--;
            }
            else{
                m++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }



    public static void main(String[] args) {
    int matrix[] []= {{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};

                     printSpiral(matrix);
                     int key=14;

    // int n= matrix.length,m=matrix[0].length;
    
    // Scanner sc= new Scanner(System.in);
    //  for(int i=0; i<n;i++){
    //     for(int j=0;j<m;j++){
    //         matrix[i][j]= sc.nextInt();
    //     }   
    // }

    // for(int i=0; i<n;i++){
    //     for(int j=0;j<m;j++){
    //         System.out.print(matrix[i][j] + " ");
    //     }   
    //     System.out.println();
    // }
    System.out.println(diagonalSum(matrix));
    searchSortedMatrix(matrix, key);
}
}
