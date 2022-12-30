import java.lang.*;
import java.util.*;

class ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double te = a + b;

        System.out.printf("percentage:%.2f\n" + (a / te) * 100 + "%");

    }
}