package StringUtilMethod;
import java.lang.String;
public class StringUtils {
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        } else return str.equals(reverse(str));
    }

    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        } else {
            return new StringBuilder(str).reverse().toString();
        }
    }
}
