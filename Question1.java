import java.util.ArrayList;
import java.util.ListIterator;

public class Question1 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(12.5);
        al.add(48.1);
        al.add(36.9);
        al.add(48.3);
        al.add(56.5);

        ListIterator li=al.listIterator();
        double count=0;
        while(li.hasNext()){
            count=count+(double)li.next();
        }
        System.out.println(count);

    }
}
