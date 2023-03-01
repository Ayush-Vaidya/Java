import java.util.Scanner;

class SumArray {

    public static void main(String args[]) {
        int A[] = { 10, 25, 34, 45, 52, 36, 17, 48, 19 };
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element:");

        int m1 = A[0];
        int m2 = A[0];
        for (int i = 0; i < A.length; i++) {
            if (m1 < A[i]) {
                m2 = m1;
                m1 = A[i];

            } else if (A[i] > m2) {
                m2 = A[i];
            }

        }
        System.out.println(m2);
        sc.close();
    }
}