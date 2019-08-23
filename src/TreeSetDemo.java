import java.util.TreeSet;

public class TreeSetDemo implements Comparable{
    String name;
    TreeSetDemo(String name){
        this.name = name;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args)
    {
        TreeSet t=new TreeSet();
        t.add("A");
        t.add("a");
        t.add("B");
        t.add("Z");
        t.add("L");
        t.add(new TreeSetDemo("Mahendra"));
        t.add(new TreeSetDemo("KOLA"));
        t.add(new TreeSetDemo("Paddu"));
        //t.add(new Integer(10));//ClassCastException
        //t.add(null);//NullPointerException
        System.out.println(t);//[A, B, L, Z, a]
    }

}
