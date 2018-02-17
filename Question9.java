import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Question9 {

    public static void main(String[] args) {
        int style=DateFormat.MEDIUM;
        System.out.println("style  -- > "+style);
        Date d=new Date();
        DateFormat df;
        df = DateFormat.getDateInstance(style, Locale.FRANCE);
        System.out.println("France : " + df.format(d));
        df = DateFormat.getDateInstance(style, Locale.ITALY);
        System.out.println("Italy : " + df.format(d));
        df = DateFormat.getDateInstance(style, Locale.US);
        System.out.println("United State : " + df.format(d));
        df = DateFormat.getDateInstance(style, Locale.JAPANESE);
        System.out.println(" Japanese : " + df.format(d));
        df = DateFormat.getDateInstance(style, Locale.ENGLISH);
        System.out.println(" English : " + df.format(d));

    }

}
