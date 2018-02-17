import java.util.HashSet;
import java.util.Iterator;

public class Question2 {
    public static void main(String[] args) {
        String string="tothenew";
        char[] array=string.toCharArray();
        HashSet hs=new HashSet();
        for(int i=0;i<array.length;i++){
            hs.add(array[i]);
        }
//        System.out.println(hs);

        System.out.println(hs.size());
        Iterator itr=hs.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
