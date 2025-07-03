package level_2;
import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		if(n == 0 || n == 1) {
			System.out.println("Not a Prime Number");
		}
		else if(n != 2){
			for(int i = 2; i < n; i++) {
				if(n % i == 0) {
					System.out.println("Not a Prime Number");
					break;
				}
				else if(i < n-1){
					continue;
				}
				else {
					System.out.println("Prime Number");
				}
			}
		}
		else {
			System.out.println("Prime Number");
		}
	}
}
