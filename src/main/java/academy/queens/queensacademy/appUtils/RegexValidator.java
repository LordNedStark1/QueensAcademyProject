package academy.queens.queensacademy.appUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {
    public static boolean isValidEmail(String email) {
        // Regex pattern for valid email address
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        // Compile the pattern and create a matcher
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        // Check if the email matches the pattern
        return matcher.matches();
    }

}
