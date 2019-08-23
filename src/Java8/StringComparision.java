package Java8;

import java.util.HashMap;

public class StringComparision {
    public String toString()
    {
        return "Test";
    }
    public static void main(String[] args){
        Integer i=new Integer(10);
        String s=new String("bhaskar");
        String ns = "bhaskar";
        System.out.println(ns.equals(s)+""+ns==s);
        StringComparision t=new StringComparision();
        System.out.println(i);
        System.out.println(s);
        System.out.println(t);
        HashMap map = new HashMap();
        map.put("  ","");
        //map.putAll();
    }
}
