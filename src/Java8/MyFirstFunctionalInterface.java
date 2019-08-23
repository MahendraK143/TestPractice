package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

@FunctionalInterface
public interface MyFirstFunctionalInterface
{
    public void firstWork();

    @Override
    public String toString();                //Overridden from Object class

    @Override
    public boolean equals(Object obj);        //Overridden from Object class
}
class test implements MyFirstFunctionalInterface {
    public void firstWork(){

    }
    public static void main(String org[]){
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Consumer<Integer> action = System.out::println;

        numberList.forEach(System.out::println);

        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        //1. Map entries
        Consumer<Map.Entry<String, Integer>> action1 = System.out::println;
        map.entrySet().forEach(System.out::println);
        map.entrySet().forEach(action1);
        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);
        map.entrySet().forEach(entry->{
            System.out.println("Key is : " + entry.getKey());
            System.out.println("Value is : " + entry.getValue());
        });
    }
}