package level_2;
import java.util.*;
public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight (in kg): ");
		double w = sc.nextDouble();
		System.out.print("Enter height (in cm): ");
		double h = sc.nextDouble();
		double b = (w / (h * h * 0.01 * 0.01));
		if(b <= 18.4) {
			System.out.println("Underweight");
		}
		else if(b <= 24.9 && b >= 18.5) {
			System.out.println("Normal");
		}
		else if(b <= 39.9 && b >= 25.0) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
	}
}
