package level_1;
import java.util.*;
public class MultiplicationTable6to9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int [] m = new int[10];
		switch(n) {
		case 6:
			for(int i = 1; i <= 10; i++) {
				m[i - 1] = n * i;
				System.out.print(m[i - 1] + " ");
			}
			break;
		case 7:
			for(int i = 1; i <= 10; i++) {
				m[i - 1] = n * i;
				System.out.print(m[i - 1] + " ");
			}
			break;
		case 8:
			for(int i = 1; i <= 10; i++) {
				m[i - 1] = n * i;
				System.out.print(m[i - 1] + " ");
			}
			break;
		case 9:
			for(int i = 1; i <= 10; i++) {
				m[i - 1] = n * i;
				System.out.print(m[i - 1] + " ");
			}
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
