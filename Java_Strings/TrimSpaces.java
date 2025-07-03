package level_1;
import java.util.*;
public class TrimSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        int[] trimIndexes = getTrimIndexes(input);
        String trimmedCustom = manualSubstring(input, trimIndexes[0], trimIndexes[1]);
        String trimmedBuiltin = input.trim();

        System.out.println("Trimmed using charAt(): \"" + trimmedCustom + "\"");
        System.out.println("Trimmed using trim():   \"" + trimmedBuiltin + "\"");

        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltin);
        System.out.println("Are both trimmed strings equal? " + areEqual);
    }

    public static int[] getTrimIndexes(String str) {
        int start = 0;
        int end = 0;
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {
        }

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ') {
                start = i;
                break;
            }
        }

        for (int i = len - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }

    public static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        int len1 = getLength(s1);
        int len2 = getLength(s2);
        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
}
