package Java8;

import java.io.FileNotFoundException;
import java.util.regex.Pattern;

public class StringMatch {

    public static void main(String args[])
    {
        String commaDelimited = "Equity,Gold,FixedIncome,Derivatives";
        String[] assetClasses = commaDelimited.split(",");
        String revState = "";
        for (int i=assetClasses.length-1; i >= 0; i--) {
            if(revState == "")
                revState = revState + assetClasses[i];
            else
                revState = revState + "," +assetClasses[i];
        }
        System.out.println(revState);
    }

    public static String revString(String statement){
        if(statement.length()==1) return statement;

        return statement.charAt(statement.length()-1)+revString(statement.substring(0,statement.length()-1));
    }
}