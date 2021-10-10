package utils;

import java.util.List;

public class ValidationUtils {
    public static boolean validNo(int no) {
        return no >= 0 && no <= 9;
    }

    public static boolean validLengthName(List<String> names) {
        for (String name : names) {
            if (!checkLength(name)) return false;
        }
        return true;
    }

    private static boolean checkLength(String name) {
        return name.length() <= 5;
    }
}
