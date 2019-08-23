class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            Thread.yield();
            System.out.println("MT"+i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }

        }
    }
}
public class ThreadDemo {
    public static void main(String arg[])throws Exception{
        MyThread mt = new MyThread();
        mt.setName("MAHENDRA");
        //mt.setPriority(10);
        mt.start();

        mt.interrupt();
        //mt.start();
        //mt.join();
        for (int i=0;i<10;i++) {
            System.out.println("TD"+i+mt.getName()+mt.getPriority());
        }
        new ThreadDemo();
    }
}
