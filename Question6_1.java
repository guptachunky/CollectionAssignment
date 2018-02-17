import java.util.*;

class SortByValue implements Comparator {

    public int compare(Object obj1, Object obj2) {

        /*Map.Entry entry1 = (Map.Entry)obj1;
        Map.Entry entry2 = (Map.Entry)obj2;
        int val=(int)entry1.getValue();
        int val1=(int)entry2.getValue();

*/
        /*if (val < val1) {

            return 1;
        }
        else if(val1 < val){
            return -1;
        }
        else
            return 0;*/

        Integer val1 = (Integer)obj1;
        Integer val2 = (Integer)obj2;
        if (val1 > val2) {
            return 1;
        } else if (val2 > val1) {
            return -1;
        } else
            return 0;
    }
}

public class Question6_1{
    public static void main(String[] args) {
        Map lhm = new LinkedHashMap();
        int[] array = {4, 1, 2, 1, 1, 3,3};

        for (int i = 0; i < array.length; i++) {
            if (!lhm.containsKey(array[i])) {
                lhm.put(array[i], 1);
            } else {
                lhm.put(array[i], ((int) lhm.get(array[i]) + 1));
            }
        }



//        List<Integer> list = new ArrayList<>(lhm.keySet());
//        list.sort((o1, o2) -> (int)lhm.get(o2) - (int)lhm.get(o1));
//        list.forEach(System.out::println);

        Set<Map.Entry<Integer,Integer>> set=lhm.entrySet();
        List<Map.Entry<Integer, Integer>> lst =new ArrayList<Map.Entry<Integer, Integer>>(set);
        Collections.sort( lst, new Comparator< Map.Entry<Integer, Integer>>()
        {
            public int compare( Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );

      System.out.println(lst);




    }
}
