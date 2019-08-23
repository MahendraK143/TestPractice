import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args)
    {
        Vector v=new Vector();
        System.out.println(v.capacity());//10
        for(int i=1;i<=10;i++)
        {
            v.addElement(i);
        }
        System.out.println(v.capacity());//10
        System.out.println(v.get(0));
        v.addElement("A");
        System.out.println(v.capacity());//20
        System.out.println(v);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
        Properties p = System.getProperties();
        p.setProperty("test","test");
        String s = p.getProperty("test1");
        s += p.get("test");
        System.out.println(s);
        try {
            URL urlForGetRequest = new URL("https://en.wikipedia.org/w/api.php?action=parse&section=0&prop=text&format=json&page=pizza");
            String readLine = null;
            HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
            conection.setRequestMethod("GET");
            int responseCode = conection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(conection.getInputStream()));
                StringBuffer response = new StringBuffer();
                while ((readLine = in .readLine()) != null) {
                    response.append(readLine);
                } in .close();
                System.out.println(response.toString().split("pizza").length);
                //return response.toString().split("pizza").length;
            } else {
                //return 0;
            }
        }catch (Exception e){
            //return 0;
        }
    }

}
