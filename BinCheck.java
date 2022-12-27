import java.lang.*;
import java.security.PublicKey;
import java.util.*;

public class BinCheck {
    public static void main(String[] arg) {
        int b = 10101101;
        String str = String.valueOf(b);
        System.out.println(str.matches("[01]+"));

    }
}