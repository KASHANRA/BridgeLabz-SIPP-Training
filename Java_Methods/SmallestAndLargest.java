package level_1;
import java.util.*;
public class SmallestAndLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int n2 = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		int n3 = sc.nextInt();
		int r [] = LS(n1, n2, n3);
		System.out.println("The largest number is: " + r[0]);
		System.out.println("The smallest number is: " + r[1]);
	}
	public static int [] LS(int a, int b, int c){
		int d = 0, e = 0;
		{
			if(a > b && a > c) {
				d = a;
			}
		    else if(b > a && b > c) {
			    d = b;
		    }
		    else {
			    d = c;
		    }
		}
		{
			if(a < b && a < c) {
				e = a;
			}
			else if(b < a && b < c) {
				e = b;
			}
			else {
				e = c;
			}
		}
		return new int [] {d, e};
	}
}
