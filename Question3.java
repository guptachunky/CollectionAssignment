import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Question3 {
    public static void main(String[] args) {
        String string="tothenew";
        HashMap hm=new HashMap();
        for(int i=0;i<string.length();i++){
            boolean b=hm.containsKey(string.charAt(i));
            if(b==false){
                hm.put(string.charAt(i),1);
            }
            else
            {
                int val=(int)hm.get(string.charAt(i));
                hm.put(string.charAt(i),val+1);
            }
        }

        Set s=hm.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            Map.Entry m=(Map.Entry)itr.next();
            System.out.println(m.getKey() +" occurrence = " +m.getValue());
        }




    }
}
