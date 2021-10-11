package utils;

import java.util.List;

public class ValidationUtils {
    private static boolean numberDiscrimination = true;
    private static final int CHAR_IDX = 0;

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

    public static boolean verificationNumber(String inputNum) {
        numberDiscrimination = true;
        String[] numArr = inputNum.split("");
        for (String s : numArr) {
            checkNumber(s.charAt(CHAR_IDX));
        }
        return numberDiscrimination;
    }

    private static void checkNumber(char charNum) {
        if(!Character.isDigit(charNum)) {
            numberDiscrimination = false;
        }
    }
}
