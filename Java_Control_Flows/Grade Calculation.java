package level_2;
import java.util.*;
public class GradeCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks in Physics: ");
		int p = sc.nextInt();
		System.out.print("Enter marks in Chemistry: ");
		int c = sc.nextInt();
		System.out.print("Enter marks in Maths: ");
		int m = sc.nextInt();
		int mp = (p + c + m)/3;
		if(mp >= 80) {
			System.out.println("Level 4, above agency-normalized standards");
		}
		else if(mp <= 79 && mp >= 70) {
			System.out.println("Level 3, at agency-normalized standards");
		}
		else if(mp <= 69 && mp >= 60) {
			System.out.println("Level 2, below, but approaching agency-normalized standards");
		}
		else if(mp <= 59 && mp >= 50) {
			System.out.println("Level 1, well below agency-normalized standards");
		}
		else if(mp <= 49 && mp >= 40) {
			System.out.println("Level 1-, too below agency-normalized standards");
		}
		else {
			System.out.println("Remedial standards");
		}
	}
}
