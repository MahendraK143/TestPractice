package Java8;

public class TreeSet extends C1{
    public static void main(String[] args)
    {
        System.out.println();
        //A1 a = new A1();
        new C1();
        //new A1();
        TreeSet t=new TreeSet();
       /* t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);*/
        //System.out.println(t);//[20, 15, 10, 5, 0]

    }

}
class A1 {
    static {   System.out.println("static a");	}
    {   System.out.println("init a");	}

    A1() {   System.out.println("cons a");	}
}
class B1 extends A1 {
    static {   System.out.println("static b");	}

    {   System.out.println("init b");	}
}
class C1 extends B1 {
    static {   System.out.println("static c");	 }
    {   System.out.println("init c");	}

    C1() {   System.out.println("cons c");	}
}
