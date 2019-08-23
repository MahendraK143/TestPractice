class SD implements Runnable{
    private Thread t;
    private String tname;
    SD(String tname){
        this.tname = tname;
    }

    @Override
    public void run() {
        while (true) System.out.print(tname);
    }
    public void start(){
        if(t == null ){
            t = new Thread(this,tname);
            t.start();
        }
    }
}
public class SampleDemo {
    public static void main(String nam[]){
        SD s1 =new SD("A");
        SD s2 =new SD("B");
        s1.start();
        s2.start();
    }
}
