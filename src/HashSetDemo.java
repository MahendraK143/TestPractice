import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args)
    {
        HashSet h=new HashSet();
        System.out.println(10&16);//false
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.remove(10));//false
        System.out.println(h.add("Z"));//false
        System.out.println(h);//[null, D, B, C, 10, Z]
        h.stream().forEach(h1->System.out.print(h1));
    }

}
