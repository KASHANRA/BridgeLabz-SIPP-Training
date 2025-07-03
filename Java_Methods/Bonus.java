package level_1;
import java.util.*;
public class Bonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of Employees: ");
		int n = sc.nextInt();
		double sy[][] = Deter(n);
		double ne [][] = New(sy, n);
		double t [] = Total(sy, n, ne);
		for(int i = 0; i < n; i++) {
			System.out.println("The salary of employee " + (i + 1) + " is " + sy[i][0] + " and the years of service is " + sy[i][1]);
		}
		for(int i = 0; i < n; i++) {
			System.out.println("The bonus of employee " + (i + 1) + " is " + ne[i][0] + " and the new salary is " + ne[i][1]);
		}
		System.out.println("The sum of Old Salary is " + t[0] + " the sum of New Salary is " + t[1] + " and the sum of Bonus is " + t[2]);
	}
	public static double [][] Deter(int a) {
		Random rand  = new Random();
		double [][] sy = new double[a][2];
		for(int i = 0; i < a; i++) {
			sy[i][0] = rand.nextInt(90000) + 10000;
			sy[i][1] = rand.nextInt(25) + 1;
		}
		return sy;
	}
	public static double[][] New(double [][] sy, int a){
		double [][] n = new double[a][2];
		for(int i = 0; i < a; i++) {
			if(sy[i][1] > 5) {
				n[i][0] = 0.05 * sy[i][0];
				n[i][1] = n[i][0] + sy[i][0];
			}
			else if(sy[i][1] <= 5) {
				n[i][0] = 0.02 * sy[i][0];
				n[i][1] = n[i][0] + sy[i][0];
			}
		}
		return n;
	}
	public static double[] Total(double [][] sy, int a, double [][] ne) {
		double os = 0;
		double ns = 0;
		double b = 0;
		double [] t = new double[3];
		for(int i = 0; i < a; i++) {
			os = os + sy[i][0];
		}
		for(int i = 0; i < a; i++) {
			ns = ns + ne[i][1];
			b = b + ne[i][0];
		}
		t[0] = os;
		t[1] = ns;
		t[2] = b;
		return t;
	}
}
