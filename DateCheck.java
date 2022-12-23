import java.lang.*;
import java.util.*;

public class DateCheck {
    public static void main(String[] arg) {

        String d = "01/12/2000";
        System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));

    }
}