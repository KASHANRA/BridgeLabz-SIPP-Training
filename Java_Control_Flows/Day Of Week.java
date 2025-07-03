package level_2;
import java.util.*;
public class DayOfWeek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day: ");
		int d = sc.nextInt();
		System.out.print("Enter month: ");
		int m = sc.nextInt();
		System.out.print("Enter year: ");
		int y = sc.nextInt();
		int y1 = 0;
		int m1 = 0;
		int d1 = 0;
		int x = 0;
		boolean b = false;
		{
			if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
				b = true;
			}
			else {
				b = false;
			}
		}
		if(m <= 12) {
			if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				if(d <= 31) {
			        y1 = y - (14 - m) / 12;
			        m1 = m + 12 * ((14 - m) / 12) - 2;
			        x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
			        d1 = (d + x + (31 * m1) / 12) % 7;
					System.out.println(d1);
				}
				else {
					System.out.println("Invalid date");
				}
			}
			else if(m == 4 || m == 6 || m == 9 || m == 11) {
				if(d <= 30) {
			        y1 = y - (14 - m) / 12;
			        m1 = m + 12 * ((14 - m) / 12) - 2;
			        x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
			        d1 = (d + x + (31 * m1) / 12) % 7;
					System.out.println(d1);
				}
				else {
					System.out.println("Invalid date");
				}
			}
			else if(b == true) {
				if(d <= 29) {
			        y1 = y - (14 - m) / 12;
			        m1 = m + 12 * ((14 - m) / 12) - 2;
			        x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
			        d1 = (d + x + (31 * m1) / 12) % 7;
					System.out.println(d1);
				}
				else {
					System.out.println("Invalid date");
				}
			}
			else if(b == false) {
				if(d <= 28) {
			        y1 = y - (14 - m) / 12;
			        m1 = m + 12 * ((14 - m) / 12) - 2;
			        x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
			        d1 = (d + x + (31 * m1) / 12) % 7;
					System.out.println(d1);
				}
				else {
					System.out.println("Invalid date");
				}
			}
		}
		else {
			System.out.println("Invalid date");
		}
	}
}
