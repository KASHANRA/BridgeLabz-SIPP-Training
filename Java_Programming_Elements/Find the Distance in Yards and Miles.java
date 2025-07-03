package level01;
import java.util.*;
public class Fourteenth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter distance in feet: ");
		double f = sc.nextDouble();
		System.out.println("The distance in yards is " + f * 0.333333 + " while the distance in miles is " + f * 0.000189394);
	}

}
