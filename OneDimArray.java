
class OneDimArray {
    public static void main(String args[]) {
        int A[] = new int[5];
        A[0] = 10;
        A[1] = 5;
        A[2] = 45;
        A[3] = 24;
        A[4] = 57;

        int B[] = { 21, 56, 548, 45, 35, 24 };
        System.out.println(B[4]);

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]++);
        }
        System.out.println("");

        for (int j = A.length - 1; j >= 0; j--) {
            System.out.println(A[j]);

        }
        System.out.println("");
        for (int x : A) {
            System.out.println(x);
        }
    }
}
