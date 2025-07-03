package level_1;
import java.util.*;
public class FrequencyOfEachDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int c = 0;
		int [] a = new int[10];
		int [] freq = new int[10];
		int b = 0;
		int d = 0;
		while(n > 0) {
			a[c] = n % 10;
			c++;
			n = n / 10;
		}
		for(int i = 0; i < c; i++) {
			b = a[i];
			freq[b] = freq[b] + 1;
			if(b > d) {
				d = b;
			}
			b = 0;
		}
		for(int i = 0; i <= d; i++) {
			System.out.println("Frequency of " + i + " is " + freq[i]);
		}
	}
}
