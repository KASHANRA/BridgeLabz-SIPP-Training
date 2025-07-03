package level_1;
import java.util.*;
public class NumberChecker2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		System.out.println("Prime number " + Prime(n));
		System.out.println("Neon number " + Neon(n));
		System.out.println("Spy number " + Spy(n));
		System.out.println("Automorphic number " + Automorphic(n));
		System.out.println("Buzz number " + Buzz(n));
	}
	public static boolean Prime(int a) {
		if(a == 0 || a == 1) {
			return false;
		}
		else if(a == 2) {
			return true;
		}
		for(int i = 2; i < a; i++) {
			if(a % i == 0) {
				return false;
			}
			else if(i < a - 1) {
				continue;
			}
		}
		return true;
	}
	public static boolean Neon(int a) {
		int n = 0;
		int b = a;
		int c = 0;
		int s = 0;
		while(a > 0) {
			c = a % 10;
			n = (n + (c * c));
			a = a / 10;
		}
		while(n > 0) {
			s = s + (n % 10);
			n = n / 10;
			
		}
		if(s == b) {
			return true;
		}
		return false;
	}
	public static boolean Spy(int a) {
		int s = 0;
		int p = 1;
		while(a > 0) {
			s = s + a % 10;
			p = p * a % 10;
			a = a / 10;
		}
		if(s == p) {
			return true;
		}
		return false;
	}
	public static boolean Automorphic(int a) {
		int s = a * a;
		int c = 0;
		int b = a;
		while(a > 0) {
			c++;
			a = a / 10;
		}
		int [] ar = new int [c];
		int e = c - 1;
		while(b > 0) {
			ar[e] = b % 10;
		    b = b / 10;
			e--;
		}
		int [] sl = new int [c];
		int d = c - 1;
		while(d >= 0) {
			sl[d] = s % 10;
			s = s / 10;
			d--;
		}
		for(int i = 0; i < c; i++) {
			if(ar[i] != sl[i]) {
				return false;
			}
		}
		return true;
	}
	public static boolean Buzz(int a) {
		int n = 0;
		if(a % 7 == 0) {
			return true;
		}
		int i = 0;
		while(i < 1) {
			n = a % 10;
			i++;
		}
		if(n == 7) {
			return true;
		}
		return false;
	}
}
