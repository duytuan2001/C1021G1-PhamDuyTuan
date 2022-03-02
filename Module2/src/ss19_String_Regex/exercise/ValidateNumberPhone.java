package ss19_String_Regex.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    private static ValidateNumberPhone phoneNumberExample;
    public static final String[] valiPhoneNumber = new String[]{"(84)-(092345678)"};
    public static final String[] invaPhoneNumber = new String[]{"31/02/1998"};


    public static Pattern pattern;
    private Matcher matcher;

    private static final String PHONENUMBER_REGEX;

    static {
        PHONENUMBER_REGEX = "(^(((0[1-9]|1[O-9]|2[0-9])[\\/](0[1-9]|1[012]))|((29|30|31))))";
    }

    public ValidateNumberPhone() {
        pattern = Pattern.compile(PHONENUMBER_REGEX);
    }

    public boolean phonenumber(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }


    public static void main(String[] args) {
        phoneNumberExample = new ValidateNumberPhone();
        for (String phonenumber : valiPhoneNumber) {
            boolean isphonenumber = phoneNumberExample.phonenumber(phonenumber);
            System.out.println("phone number is " + phonenumber + " is valid : " + isphonenumber);

        }
        for (String phonenumber : invaPhoneNumber) {
            boolean isphonenumber = phoneNumberExample.phonenumber(phonenumber);
            System.out.println("phone number is " + phonenumber + " is valid : " + isphonenumber);
        }
    }
}

