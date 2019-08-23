package Java8;

import java.io.File;
import java.io.FileFilter;

public class LmbdaTest {
    public static void main(String []arg){
        File[] files = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });
        Thread t = new Thread(()->{System.out.println("asdffddffda");});
        t.start();
        files = new File(".").listFiles((file)->file.isHidden());
        files = new File(".").listFiles(File::isHidden);
     }
}
