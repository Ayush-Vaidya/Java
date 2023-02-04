import java.util.Scanner;

import javax.xml.transform.SourceLocator;

public class AddMatrix {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
        int B[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
        int C[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int x[] : C) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("");

        }

    }
}