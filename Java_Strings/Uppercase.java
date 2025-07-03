package level_1;
import java.util.*;
public class Uppercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		String s2 = s.toUpperCase();
		System.out.println("The Original String is: " + s);
		System.out.println("The Uppercase String using toUpperCase is: " + s2);
		System.out.println("The Uppercase String using ASCII value is: " + Upper(s));
	}
	public static String Upper(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int d = (int) c;
			if(d >= 97 && d <= 122) {
				d = d - 32;
				c = (char) d;
			}
			sb.append(c);
		}
		return sb.toString();
	}
}
