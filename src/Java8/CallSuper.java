package Java8;

 interface FirstInterface {
    default void someMethod(){
        System.out.println("Am from first interface");
    }
}

 interface SecondInterface {
    default void someMethod() {
        System.out.println("Am from second interface");
    }
}
class callSSuper implements FirstInterface,SecondInterface{
    @Override
    public void someMethod() {
        FirstInterface.super.someMethod();
    }

    static String name = "Ma";
    public static void m1(){
        System.out.println("mS:"+name);
    }
}
class Child extends callSSuper{
    static String name = "Maaa";
    public static void m1(){
        //super.m1();
        System.out.println("mC:"+name);
    }
    public void m2(){
        super.m1();
        //System.out.println("m2:"+name);
    }
}

public class CallSuper {
    public static void main(String ll[]) {
        callSSuper cs = new Child();
        cs.someMethod();
        callSSuper.m1();
        Child.m1();

        //Child child = new Child();
    }
}
