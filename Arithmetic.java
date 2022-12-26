import java.util.Scanner;
import java.lang.*;

public class Arithmetic {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        float b, h;
        System.out.println("enter base:");
        b = sc.nextFloat();
        System.out.println("enter height:");
        h = sc.nextFloat();
        System.out.println("The area of the triangle is:" + (b * h) / 2);

    }
}
