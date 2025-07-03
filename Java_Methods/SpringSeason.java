package level_1;
import java.util.*;
public class SpringSeason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date: ");
		int d = sc.nextInt();
		System.out.print("Enter month: ");
		int m = sc.nextInt();
		Spring(d, m);
	}
	public static void Spring(int a, int b) {
		if(b == 3) {
			if(a >= 20 && a <= 31) {
				System.out.println("Spring Season");
			}
			else if(a >= 1 && a <= 19){
				System.out.println("Not a Spring Season");
			}
			else {
				System.out.println("Invlaid Date");
			}
		}
		else if(b == 4) {
			if(a >= 1 && a <= 30) {
				System.out.println("Spring Season");
			}
			else {
				System.out.println("Invlaid Date");
			}
		}
		else if(b == 5) {
			if(a >= 1 && a <= 31) {
				System.out.println("Spring Season");
			}
			else {
				System.out.println("Invlaid Date");
			}
		}
		else if(b == 6) {
			if(a >= 1 && a <= 20) {
				System.out.println("Spring Season");
			}
			else if(a >= 21 && a <= 30){
				System.out.println("Not a Spring Season");
			}
			else {
				System.out.println("Invlaid Date");
			}
		}
	}
}
