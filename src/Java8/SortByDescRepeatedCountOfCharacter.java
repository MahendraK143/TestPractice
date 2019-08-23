package Java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SortByDescRepeatedCountOfCharacter {
    public static void main(String arg[]){
        String ss[] = {"C","F","C","F","F","A","C","F","A","B"};
        Map<String,Integer> map = new HashMap<>();
        int count = 0;
        for(String s:ss){
            count = 0;
            if(map.containsKey(s)){
                count = map.get(s);
                map.put(s,++count);
            }else{
                map.put(s,++count);
            }
        }
        System.out.print(map);

        Set<Map.Entry<String,Integer>> set = map.entrySet();
        Map<Integer,String> revMap = new HashMap<>();
        for(Map.Entry<String,Integer> s:set){
            revMap.put(s.getValue(),s.getKey());
        }
        System.out.println(revMap);
        Set<Integer> sset = revMap.keySet();
        int countt=1;
        String sss = "{";
        for(Integer i : sset){
            if(map.size()==countt++)
                sss += revMap.get(i);
            else
                sss += revMap.get(i)+",";
        }
        System.out.println(sss+"}");
    }
}
