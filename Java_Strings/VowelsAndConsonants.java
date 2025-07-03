package level_1;
import java.util.*;
public class VowelsAndConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		String [] s2 = VC(s);
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s2[i] + " ");
		}
	}
	public static String[] VC(String s) {
		StringBuilder sb = new StringBuilder();
		String [] ss = new String[s.length()];
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int d = (int) c;
			if(d >= 65 && d <= 96) {
				d = d + 32;
				c = (char) d;
			}
			sb.append(c);
		}
		for(int i = 0; i < sb.length(); i++) {
			char e = sb.charAt(i);
			int d = (int) e;
			if(d == 97 || d == 101 || d == 105 || d == 111 || d == 117) {
				ss[i] = "Vowel";
			}
			else if(d >= 97 && d <= 122) {
				ss[i] = "Consonant";
			}
			else {
				ss[i] = "Not a Letter";
			}
		}
		return ss;
	}
}
