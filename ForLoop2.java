import java.lang.*;
import java.util.*;

class LoopPractise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entr a number:");
        int n = sc.nextInt();

        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            System.out.println(r);
        }
    }
}