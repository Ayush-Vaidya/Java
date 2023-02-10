public class IncreaseSizeArray {
    public static void main(String args[]) {
        int A[] = { 2, 5, 6, 7, 5 };
        int B[] = new int[2 * A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];

            System.out.print(B[i] + ",");

        }
        A = B;
        B = null;
        for (int n : A) {
            System.out.print(n + ",");

        }
        System.out.println("");
        System.out.println(A.length);
    }
}
