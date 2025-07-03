package level_1;
import java.util.*;
public class CompareTwoStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st String: ");
		String s1 = sc.nextLine();
		System.out.print("Enter 2nd String: ");
		String s2 = sc.nextLine();
		boolean b = s1.equals(s2);
		System.out.println("The strings are equal using Equals " + Compare(s1, s2));
		System.out.println("The strings are equal using charAt " + b);
		
	}
	public static boolean Compare(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
