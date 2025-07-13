package level_1;
public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }
}
