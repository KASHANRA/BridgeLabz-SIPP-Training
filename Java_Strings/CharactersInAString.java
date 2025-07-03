package level_1;
import java.util.*;
public class CharactersInAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st String: ");
		String s1 = sc.nextLine();
		System.out.print("Enter 2nd String: ");
		String s2 = sc.nextLine();
		char [] a = Char(s1);
		char [] b = s2.toCharArray();
		System.out.println("Both Strings are equal " + Compare(a, b));
	}
	public static char [] Char(String ss) {
		char [] r = new char[ss.length()];
		for(int i = 0; i < ss.length(); i++) {
			r[i] = ss.charAt(i);			
		}
		return r;
	}
	public static boolean Compare(char[] c, char[] d) {
		int z = 0;
		if(c.length != d.length) {
			return false;
		}
		if(c.length > d.length) {
			z = c.length;
		}
		else {
			z = d.length;
		}
		for(int i = 0; i < z; i++) {
			if(c[i] != d[i]) {
				return false;
			}
		}
		return true;
	}
}
