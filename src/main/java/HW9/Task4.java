package HW9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {

        String phoneNumber = "+38(095)6345421";
        Pattern pattern = Pattern.compile("\\+38\\(0[0-9]{2}\\)[0-9]{7}");
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            System.out.println("Phone number " + phoneNumber + " is valid ");
        } else {
            System.out.println("Phone number " + phoneNumber + " is invalid ");
        }
    }
}
