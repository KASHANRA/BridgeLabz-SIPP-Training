package level_1;
import java.util.*;
public class HeightOfPlayers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] h = new int [11];
		for(int i = 0; i < 11; i++) {
			System.out.print("Enter height of " + (i + 1) + " player (150 - 250cm) : ");
			h[i] = sc.nextInt();
			if(h[i] < 150 || h[i] > 250) {
				System.out.println("Enter height between 150 and 250 cm");
				i--;
			}
		}
		System.out.println("The Mean height is: " + Mean(h));
		System.out.println("The Tallest of height is: " + Tallest(h));
		System.out.println("The Shortest of height is: " + Shortest(h));
	}
	public static double Mean(int [] h) {
		double a = 0;
		for(int i = 0; i < 11; i++) {
			a = a + h[i];
		}
		return a / 11;
	}
	public static int Tallest(int [] h) {
		int t = 0;
		for(int i = 0; i < 11; i++) {
			if(h[i] > t) {
				t = h[i];
			}
		}
		return t;
	}
	public static int Shortest(int [] h) {
		int s = Integer.MAX_VALUE;
		for(int i = 0; i < 11; i++) {
			if(h[i] < s) {
				s = h[i];
			}
		}
		return s;
	}
}
