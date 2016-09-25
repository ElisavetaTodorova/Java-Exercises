package p03Mankind;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Human {

    private String firstName;
    private String secondName;

    public Human(String firstName, String secondName) {
        setFirstName(firstName);
        setSecondName(secondName);
    }

    private void setFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z]\\w+");
        Matcher matcher = pattern.matcher(firstName);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        }
        if (firstName.length() < 4) {
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        this.firstName = firstName;
    }

    protected void setSecondName(String secondName) {
        Pattern pattern = Pattern.compile("^[A-Z]\\w+");
        Matcher matcher = pattern.matcher(secondName);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
        this.secondName = secondName;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected String getSecondName() {
        return secondName;
    }
}
