package level_1;
import java.util.*;
public class Substring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		System.out.print("Enter start index: ");
		int i = sc.nextInt();
		System.out.print("Enter end index: ");
		int e = sc.nextInt();
		Sub(s, i, e);
	}
	public static void Sub(String s2, int a, int b) {
		StringBuilder sb = new StringBuilder();
		boolean x = true;
		String s3 = s2.substring(a, b);
		for(int i = a; i < b; i++) {
			sb.append(s2.charAt(i));
		}
		String s4 = sb.toString();
		if(!s3.equals(s4)) {
			x = false;
		}
		System.out.println("The string are equal " + x);
	}
}
