package level_1;
import java.util.*;
public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int customLength = getLengthWithoutUsingLength(input);
        int builtInLength = input.length();

        System.out.println("Length (using charAt() + exception): " + customLength);
        System.out.println("Length (using length() method): " + builtInLength);
    }

    public static int getLengthWithoutUsingLength(String str) {
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
