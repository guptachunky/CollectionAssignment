import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Question6 {
    public static void main(String[] args) {
        Map<Integer,Integer> hm = new HashMap<>();
        Map<Integer,Integer> lhm=new LinkedHashMap<>();
        lhm.put(4,1);
        lhm.put(1,1);
        lhm.put(2,1);
        lhm.put(1,1);
        lhm.put(1,1);
        lhm.put(3,1);
        System.out.println(lhm);
        int[] array = {4, 1, 2, 1, 1, 3};
        for (int i = 0; i < array.length; i++) {
            if (!hm.containsKey(array[i])) {
                hm.put(array[i], 1);
            } else {
                hm.put(array[i], hm.get(array[i]) + 1);
            }
        }

        int occ=0,val=0;
        for (int i = 0; i < array.length; i++) {
            int max = Integer.MIN_VALUE;
            if (array[i] != -1) {
                int count=0,index=0;

                for (int j = i; j < array.length; j++) {
                  if(array[j]!= -1){
                      if(count==0){
                          index=j;
                          count=1;
                      }
                      occ=(int)hm.get(array[j]);
                  }
                  else
                      break;


                  if(occ>max){
                      val=array[j];
                      max=occ;
                  }
                }
                count=0;
                if(array[index]!=val){
                    array[index]=val;
                }

                for(int j=i+1;j<array.length;j++){
                    if(array[j]==val){
                        array[j]=-1;
                    }
                }

                for(int k=0;k<max;k++){
                    System.out.print(val+" ");
                }
            }

        }
//        System.out.println(hm);
    }
}
