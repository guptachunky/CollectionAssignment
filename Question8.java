import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Question8 {
    static String months[] = "jan feb march april may june july agust sept october november december".split(" ");

    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("dd-MMMMM-yyyy");
        System.out.println(sf.format(d));
    }
}
