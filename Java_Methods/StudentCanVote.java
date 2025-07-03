package level_1;
import java.util.*;
public class StudentCanVote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age of 10 students: ");
		int [] a = new int[10];
		for(int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		Vote(a);
	}
	public static void Vote(int [] b) {
		for(int i = 0; i < 10; i++) {
			if(b[i] >= 18) {
				System.out.println("Student can Vote");
			}
			else {
				System.out.println("Student cannot Vote");
			}
		}
	}
}
