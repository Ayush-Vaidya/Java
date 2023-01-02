import java.lang.*;
import java.util.*;

public class KeybReadd {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        boolean d;
        System.out.println("Enter 2 numbers");

        d = s.hasNextInt();
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println("sum is " + c);
        System.out.println(d);

    }

}
