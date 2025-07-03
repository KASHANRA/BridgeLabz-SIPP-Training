package level_1;
import java.util.*;
public class DigitsOfTheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int [] a = new int[20];
		int b = 0;
		int l = a[0];
		int sl = Integer.MIN_VALUE;
		while(n > 0) {
			a[b] = n % 10;
			b++;
			n = n / 10;
		}
		for(int i = 0; i < b; i++) {
			if(a[i] > l) {
				sl = l;
				l = a[i];
			}
			else if(a[i] > sl && a[i] < l) {
				sl = a[i];
			}
		}
		System.out.println("The Largest number is: " + l);
		System.out.println("The 2nd Largest number is: " + sl);
	}
}
