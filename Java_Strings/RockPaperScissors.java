package level_1;
import java.util.*;
public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of Games: ");
		int n = sc.nextInt();
		sc.nextLine();
		String [] s = {"Rock", "Paper", "Scissors"};
		String uc = new String();
		String [] cc = Computer(n, s);
		int u = 0;
		int c = 0;
		for(int i = 0; i < n; i++) {
			System.out.print("Enter your choice: ");
			uc = sc.nextLine();
			System.out.println("Computer choice is: " + cc[i]);
			int re = Winner(uc, cc[i]);
			if(re == 1) {
				System.out.println("User Wins");
				u++;
			}
			else if(re == -1) {
				System.out.println("Computer Wins");
				c++;
			}
			else {
				System.out.println("Draw");
			}
		}
		System.out.println("The average win of user is: " + (u%n));
		System.out.println("The average win of computer is: " + (c%n));
		System.out.println("The percentage win of user is: " + (u%n) * 100);
		System.out.println("The percentage win of computer is: " + (c%n) * 100);
	}
	public static String[] Computer(int n, String[] s) {
		String [] r = new String[n];
		Random rand = new Random();
		for(int i = 0; i < n; i++) {
			int j = rand.nextInt(3);
			r[i] = s[j];
		}
		return r;
 	}
	public static int Winner(String uc, String cc) {
			if(uc.equals("Rock") && cc.equals("Rock")) {
				return 0;
			}
			else if(uc.equals("Rock") && cc.equals("Paper")) {
				return -1;
			}
			else if(uc.equals("Paper") && cc.equals("Paper")) {
				return 0;
			}
			else if(uc.equals("Paper") && cc.equals("Scissors")) {
				return -1;
			}
			else if(uc.equals("Scissors") && cc.equals("Scissors")) {
				return 0;
			}
			else if(uc.equals("Scissors") && cc.equals("Rock")) {
				return -1;
			}
		return 1;
	}
}
