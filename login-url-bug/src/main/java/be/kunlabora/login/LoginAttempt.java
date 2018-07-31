package be.kunlabora.login;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static java.util.regex.Pattern.compile;

public class LoginAttempt {

    public static boolean control(final String username) {
        final Pattern pattern = compile("^(?=[a-z]{2})(?=.{4,26})(?=[^.]*\\.?[^.]*$)(?=[^_]*_?[^_]*$)[\\w.]+$", CASE_INSENSITIVE);

        return pattern.matcher(username).matches();
    }
}