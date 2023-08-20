public class InsertArray {

    public static void main(String args[]) {

        int A[] = new int[10];
        A[0] = 10;
        A[1] = 15;
        A[2] = 16;
        A[3] = 21;
        A[4] = 25;
        A[5] = 34;
        A[6] = 54;
        A[7] = 23;
        int n = 6;
        for (int i = 0; i < n; i++)

            System.out.print(A[i] + ",");
        System.out.println("");
        int x = 20;
        int index = 2;
        for (int i = n; i > index; i--)
            A[i] = A[i - 1];
        A[index] = x;

        for (int i = 0; i < n; i++)
            System.out.print(A[i] + ",");
        System.out.println("");

    }
}
