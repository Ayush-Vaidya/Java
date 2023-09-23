import java.lang.*;
import java.util.*;

class Cuboid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l, b, h;
        int totalArea, volume;

        System.out.println("enter length, breadth, height:");
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();

        totalArea = (2 * (l * b + l * h + b * h));
        volume = (l * b * h);
        System.out.println("totalArea: " + totalArea);
        System.out.println("volume: " + volume);

    }

}