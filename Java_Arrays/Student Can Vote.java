package level_1;
import java.util.*;
public class StudentCanVote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] age = new int[10];
		for(int i = 0; i < 10; i++) {
			age[i] = sc.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			if(age[i] > 18) {
				System.out.println("Student can Vote");
			}
			else {
				System.out.println("Student cannot Vote");
			}
		}
	}
}
