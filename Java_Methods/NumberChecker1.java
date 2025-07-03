package level_1;
import java.util.*;
public class NumberChecker1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int c = Count(n);
		System.out.println("The length of number is: " + c);
		int [] ar = Digits(n, c);
		int [] r = Largest(ar, c);
		int [] r2 = Smallest(ar, c);
		System.out.print("The digits of the number is: ");
		for(int i = c - 1; i >= 0; i--) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		System.out.println("Duck number: " + Duck(ar));
		System.out.println("Armstrong number: " + Armstrong(ar, c, n));
		System.out.println("The largest number is " + r[0] + " and 2nd largest is " + r[1]);
		System.out.println("The smallest number is " + r2[0] + " and 2nd smallest is " + r2[1]);
	}
	public static int Count(int a) {
		int c = 0;
		while(a > 0) {
			c++; 
			a = a / 10;
		}
		return c;
	}
	public static int [] Digits(int a, int b) {
		int [] ar = new int [b];
		int c = 0;
		while(a > 0) {
			ar[c] = a % 10;
			c++;
			a = a / 10;
		}
		return ar;
	}
	public static boolean Duck(int [] ar) {
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean Armstrong(int [] ar, int c, int b) {
		double s = 0;
		for(int i = 0; i < c; i++) {
			s = s + Math.pow(ar[i], c);
		}
		if(s == b) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int [] Largest(int [] ar, int c) {
		int lar = Integer.MIN_VALUE;
		int slar = Integer.MIN_VALUE;
		int [] r = new int [2];
		for(int i = 0; i < c; i++) {
			if(ar[i] > lar) {
				lar = ar[i];
			}
		}
		for(int i = 0; i < c; i++) {
			if(ar[i] > slar && ar[i] < lar) { 
				slar = ar[i];
			}
		}
		r[0] = lar;
		r[1] = slar;
		return r;
	}
	public static int [] Smallest(int [] ar, int c) { 
		int sml = Integer.MAX_VALUE;
		int ssml = Integer.MAX_VALUE;
		int [] r = new int[2];
		for(int i = 0; i < c; i++) {
			if(ar[i] < sml) {
				sml = ar[i];
			}
		}
		for(int i = 0; i < c; i++) {
			if(ar[i] < ssml && ar[i] > sml) {
				ssml = ar[i];
			}
		}
		r[0] = sml;
		r[1] = ssml;
		return r;
	}
}
