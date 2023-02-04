import java.util.Scanner;

public class Array2D {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        for (int x[] : A) {
            for (int y : x) {
                System.out.print(y + ",");
            }
            System.out.println("");
        }
        sc.close();
    }
}
