import java.lang.*;
import java.util.*;

class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three marks:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int total = (a + b + c);
        int avg = (total / 3);
        System.out.println("Total marks are: " + total);
        System.out.println("Average is: " + avg);
        if (avg >= 70) {
            System.out.println("A");

        } else if (60 <= avg && avg < 70) {
            System.out.println("B");

        } else if (50 <= avg && avg < 60)

        {
            System.out.println("C");

        } else if (40 <= avg && avg < 50) {
            System.out.println("D");

        } else if (avg < 40) {
            System.out.println("F");
        }

    }
}