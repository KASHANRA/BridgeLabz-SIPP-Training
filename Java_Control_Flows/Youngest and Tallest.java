package level_2;
import java.util.*;
public class YoungestandTallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age of Amar: ");
		int am = sc.nextInt();
		System.out.print("Enter age of Akbar: ");
		int ak = sc.nextInt();
		System.out.print("Enter age of Anthony: ");
		int an = sc.nextInt();
		System.out.print("Enter height of Amar: ");
		int am2 = sc.nextInt();
		System.out.print("Enter height of Akbar: ");
		int ak2 = sc.nextInt();
		System.out.print("Enter height of Anthony: ");
		int an2 = sc.nextInt();
		if(am < ak && am < an) {
			System.out.println("Amar is youngest");
		}
		else if(ak < am && ak < an) {
			System.out.println("Akbar is youngest");
		}
		else {
			System.out.println("Anthony is youngest");
		}
		if(am2 > ak2 && am2 > an2) {
			System.out.println("Amar is tallest");
		}
		else if(ak2 > am2 && ak2 > an2) {
			System.out.println("Akbar is tallest");
		}
		else {
			System.out.println("Anthony is tallest");
		}
	}

}
