package Practic8.home_work.exception_task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void validate(String email){
        String regex = "^[\\w.-]+@[\\w.-]+\\.\\w{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()){
            throw new InvalidEmailException("Неверный формат email: " + email);
        }
    }
}
