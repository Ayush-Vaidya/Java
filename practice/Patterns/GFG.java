
// java program to count appearances of
// a digit 'd' in range from [0..n]
import java.*;

public class GFG {

    static int getOccurrence(int n, int d) {

        // Initialize result
        int result = 0;

        // Count appearances in numbers
        // starting from d.
        int itr = d;

        while (itr <= n) {

            // When the last digit is
            // equal to d
            if (itr % 10 == d)
                result++;

            // When the first digit is
            // equal to d then
            if (itr != 0 && itr / 10 == d) {

                // increment result as
                // well as number
                result++;
                itr++;
            }

            // In case of reverse of number
            // such as 12 and 21
            else if (itr / 10 == d - 1)
                itr = itr + (10 - d);
            else
                itr = itr + 10;
        }

        return result;
    }

    // Driver code
    public static void main(String[] args) {
        int n = 11, d = 1;

        System.out.println(getOccurrence(n, d));
    }
}