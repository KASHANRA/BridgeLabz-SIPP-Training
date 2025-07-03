package level_1;
import java.util.*;
public class GradeCalculation2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of students: ");
		int n = sc.nextInt();
		int s = 0;
		int [][] m = new int [n][3];
		double [] p = new double[n];
		String [] g = new String[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter marks of " + (i + 1) + " student");
			for(int j = 0; j < 3; j++) {
				String sub =  j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths";
				System.out.print("Enter marks in " + sub + ": ");
				m[i][j] = sc.nextInt();
				s = s + m[i][j];
			}
			p[i] = s / 3.0;
			s = 0;
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Student " + (i + 1));
			for(int j = 0; j < 3; j++) {
				String sub =  j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths";
				System.out.println(sub + ": " + m[i][j]);
			}
			System.out.println("Percentage is: " + p[i]);
			if(p[i] >= 80.0) {
				g[i] = "Level 4, above agency-normalized standards";
				System.out.println("Grade is: " + g[i]);
			}
			else if(p[i] <= 79.9 && p[i] >= 70.0) {
				g[i] = "Level 3, at agency-normalized standards";
				System.out.println("Grade is: " + g[i]);
			}
			else if(p[i] <= 69.9 && p[i] >= 60.0) {
				g[i] = "Level 2, below, but approaching agency-normalized standards";
				System.out.println("Grade is: " + g[i]);
			}
			else if(p[i] <= 59.9 && p[i] >= 50.0) {
				g[i] = "Level 1, well below agency-normalized standards";
				System.out.println("Grade is: " + g[i]);
			}
			else if(p[i] <= 49.9 && p[i] >= 40.0) {
				g[i] = "Level 1-, too below agency-normalized standards";
				System.out.println("Grade is: " + g[i]);
			}
			else {
				g[i] = "Remedial standards";
				System.out.println("Grade is: " + g[i]);
			}
		}
	}
}
