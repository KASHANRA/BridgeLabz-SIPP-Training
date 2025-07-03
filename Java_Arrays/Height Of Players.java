package level_1;
import java.util.*;
public class HeightOfPlayers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many players are there: ");
		int n = sc.nextInt();
		int [] h = new int[n];
		int t = 0;
		double a = 0;
		System.out.print("Enter height of players: ");
 		for(int i = 0; i < n; i++) {
 			h[i] = sc.nextInt();
 			t = t + h[i];
 		}
 		a = (double)t / n;
 		System.out.println("The average height of players is: " + a);
	}
	
}
