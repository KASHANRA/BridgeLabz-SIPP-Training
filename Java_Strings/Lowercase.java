package level_1;
import java.util.*;
public class Lowercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		String s2 = Lower(s);
		System.out.println("The Original String is: " + s);
		System.out.println("The Lowercase String is: " + s2);
	}
	public static String Lower(String s2) {
		String s3 = new String();
		s3 = s2.toLowerCase();
		return s3;
	}
}
