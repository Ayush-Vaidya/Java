import java.lang.*;
import java.util.*;

class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int m = n;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;

        }
        if (sum == m) {
            System.out.println("It's an armstrong no.");

        } else {
            System.out.println("its not an armstrong no.");
        }

    }
}