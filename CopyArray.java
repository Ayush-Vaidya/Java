public class CopyArray {
    public static void main(String args[]) {

        int A[] = { 1, 2, 3, 4, 5, 6, 7 };
        int B[] = new int[10];
        int i;
        System.out.println("Element of A are:");
        for (int x : A) {
            System.out.print(x + ",");
        }
        System.out.println("");
        System.out.println("element of B are: ");
        for (i = 0; i < A.length; i++) {
            B[i] = A[i];

            System.out.print(B[i] + ",");

        }
        A = B;

        System.out.println("");
    }
}
