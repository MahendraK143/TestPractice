class Display {

    public synchronized void wish(String name)
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("good morning:"+name);
/*
            try
            {
                //Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {}
*/
            //System.out.println(name);
        }
    }
}
class MyThread1 extends Thread {
    private Display display;
    private String name;
    MyThread1(Display d,String name){
        this.display = d;
        this.name = name;
    }
    @Override
    public void run() {
        display.wish(name);
    }
}
public class SynchronizedDemo {
    public static void main(String arg[]){
        MyThread1 m1 = new MyThread1(new Display(),"Mahendra");
        MyThread1 m2 = new MyThread1(new Display(),"Mahendra1");
        m1.start();
        m2.start();
    }
}
