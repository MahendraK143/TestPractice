import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
    private Object index[];
    private Object indexd[]={};
    ArrayListDemo(){
        this.index=indexd;
    }
    public static void main(String[] args)
    {
        ArrayListDemo demo = new ArrayListDemo();
        ArrayList a=new ArrayList();
        a.add("A");
        a.add(10);
        a.add("A");
        a.add(null);
        System.out.println(a.get(0));//[A, 10, A, null]
        a.remove(2);
        System.out.println(a);//[A, 10, null]
        a.add(2,"m");
        a.add("n");
        System.out.println(a);//[A, 10, m, null, n]
        //System.arraycopy();
        LinkedList l=new LinkedList();
        l.add("bhaskar");
        l.add(30);
        l.add(null);
        l.add(1,"Mahendra");
        l.add("bhaskar");
        System.out.println(l);//[bhaskar, 30, null, bhaskar]
        l.set(0,"software");
        System.out.println(l);//[software, 30, null, bhaskar]
        l.set(0,"venky");
        System.out.println(l);//[venky, 30, null, bhaskar]
        l.removeLast();
        System.out.println(l);//[venky, 30, null]
        l.addFirst("vvv");
        System.out.println(l);//[vvv, venky, 30, null]

    }

}
