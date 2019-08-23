package Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArraySorting {
    public static void main(String arg[]){
        int arr[] = {23,23,33,1,22,1,5,33,0,12,21,12,21};
        for(int i=0; i < arr.length; i++){
            for(int j=i+1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = map.keySet();
        System.out.println("");
        for (int i=0;i < arr.length; i++){
            int count=1;
            if(set.contains(arr[i])){
                count=map.get(arr[i]);
                map.put(arr[i], ++count);
            }else{
                map.put(arr[i],count);
            }
        }
        System.out.print(map);
    }
}
