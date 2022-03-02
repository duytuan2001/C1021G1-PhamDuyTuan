package ss19_String_Regex.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassExample {

    private static ValidateClassExample validateClassExample;
    public static final String[] valiValidata = new String[]{"C1234G","A7890H","P3456M"};
    public static final String[] invalidValidata = new String[]{"B1234C","M1957O","$124E"};


    private static Pattern pattern;
    private Matcher matcher;

    private static final String VALIDATE_REGSE = "^[CAP][0-9]{4}[GHIKLM]$";
    public ValidateClassExample(){
        pattern = Pattern.compile(VALIDATE_REGSE);

    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        validateClassExample = new ValidateClassExample();
        for (String validata : valiValidata){
            boolean isvalid = validateClassExample.validate(validata);
            System.out.println("Validata is " + validata +" is valid: " + isvalid);
        }
        for (String validata : invalidValidata){
            boolean isvalid = validateClassExample.validate(validata);
            System.out.println("Validata is " + validata + " is valid : " + isvalid);
        }
    }


}
