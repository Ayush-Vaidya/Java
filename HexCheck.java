import java.lang.*;
import java.security.PublicKey;
import java.util.*;

public class HexCheck {
    public static void main(String[] arg) {
        String str = "2A23B";
        System.out.println(str.matches("[0-9ṁA-F]+"));

    }
}