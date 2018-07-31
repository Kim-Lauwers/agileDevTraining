package be.kunlabora.urls;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static java.util.regex.Pattern.compile;

public class Verifier {

    public static boolean verifyUrl(final String url) {
        final Pattern pattern = compile("http:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#?&//=]*)", CASE_INSENSITIVE);

        return pattern.matcher(url).matches();
    }
}