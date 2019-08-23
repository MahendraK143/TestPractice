package Java8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValdation {
    Pattern pattern;
    Matcher matcher;
    public PasswordValdation(){
        //pattern = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%&]).{8,40})");
    }
    public boolean validation(final String password){
        pattern = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%&]).{8,40})");
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
    public static void main(String arg[]){
        PasswordValdation valdation = new PasswordValdation();
        //valdation.pattern = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%&]).{8,40})");
        System.out.println(valdation.validation("Passswod@5936"));
        System.out.println(valdation.validation("Passswod5936"));
    }
}
