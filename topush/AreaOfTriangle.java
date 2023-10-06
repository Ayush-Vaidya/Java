import java.util.Scanner;
import java.lang.*;

public class AreaOfTriangle {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        float s;
        double area;
        System.out.println("Enter side a ");
        a = sc.nextInt();
        System.out.println("Enter side b ");
        b = sc.nextInt();
        System.out.println("Enter side c ");
        c = sc.nextInt();

        s = (a + b + c) / 2f;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("area of triangle: " + area);

    }
}
