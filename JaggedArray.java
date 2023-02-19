import java.util.Scanner;

import javax.xml.transform.SourceLocator;

public class JaggedArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A[][];
        A = new int[3][];
        A[0] = new int[2];
        A[1] = new int[4];
        A[2] = new int[3];

        for (int x[] : A) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }

    }
}