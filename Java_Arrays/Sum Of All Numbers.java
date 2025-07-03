package level_1;
import java.util.*;
public class SumOfAllNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] n = new int[10];
		int [] nn = new int[10];
		int s = 0;
		while(true) {
			for(int i = 0; i < 10; i++) {
				n[i] = sc.nextInt();
				s = s + n[i];
				nn[i] = n[i];
				if(n[i] == 0 || n[i] < 0) {
					break;
				}
			}
			break;
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(n[i]+ " ");
		}
		System.out.println(s);
	}
}
