package level_1;
import java.util.*;
public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int r = sc.nextInt();
		System.out.print("Enter columns: ");
		int c = sc.nextInt();
		int [] b = new int[r * c];
		int [][] a = new int[r][c];
		int d = 0;
		System.out.print("Enter elements: ");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				b[d] = a[i][j];
				d++;
			}
		}
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
