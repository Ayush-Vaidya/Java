import java.lang.*;
import java.util.*;

class OddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int a = sc.nextInt();
        if (a >= 14 && a <= 55) {
            System.out.println("he is young");

        }

        else {
            System.out.println(
                    "he is not young");
        }

    }
}