package level_1;
import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		String [] sub = s.split(" ");
		String re = "";
		for(int i = 0; i < sub.length; i++) {
			String w = sub[i];
			String r = "";
			for(int j = w.length() - 1; j >= 0; j--) {
				r = r + w.charAt(j);
			}
			re = (re + r) + " ";
		}
		System.out.println("The reversed String is: " + re);
	}
}
