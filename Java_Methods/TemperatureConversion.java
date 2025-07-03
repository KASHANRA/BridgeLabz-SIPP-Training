package level_1;
import java.util.*;
public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Farhenheit To Celsius");
		System.out.println("2. Celsius To Farhenheit");
		System.out.println("3. Pounds To Kilograms");
		System.out.println("4. Kilograms To Pounds");
		System.out.println("5. Gallons To Liters");
		System.out.println("6. Liters To Gallons");
		System.out.print("What do you want to do: ");
		int n = sc.nextInt();
		switch(n) {
		case 1:
			System.out.print("Enter temperature (in Farhenheit): ");
			double f = sc.nextDouble();
			System.out.println("The temperature in Celsius is: " + FarhenheitToCelsius(f));
			break;
		case 2:
			System.out.print("Enter temperature (in Celsius): ");
			double c = sc.nextDouble();
			System.out.println("The temperature in Farhenheit is: " + CelsiusToFarhenheit(c));
			break;
		case 3:
			System.out.print("Enter weight (in Pounds): ");
			double p = sc.nextDouble();
			System.out.println("The weight in Kilograms is: " + PoundsToKilograms(p));
			break;
		case 4:
			System.out.print("Enter weight (in Kilograms): ");
			double k = sc.nextDouble();
			System.out.println("The weight in Pounds is: " + KilogramsToPounds(k));
			break;
		case 5:
			System.out.print("Enter volume (in Gallons): ");
			double g = sc.nextDouble();
			System.out.println("The volume in Liters is: " + GallonsToLiters(g));
			break;
		case 6:
			System.out.print("Enter volume (in Liters): ");
			double l = sc.nextDouble();
			System.out.println("The volume in Gallons is: " + LitersToGallons(l));
			break;
		default:
			System.out.println("Invalid choice");
		}
			
	}
	public static double FarhenheitToCelsius(double t) {
		double a = (t - 32) * 5 / 9;
		return a;
	}
	public static double CelsiusToFarhenheit(double t) {
		double a = (t * 9 / 5) + 32;
		return a;
	}
	public static double PoundsToKilograms(double t) {
		double a = t * 0.453592;
		return a;
	}
	public static double KilogramsToPounds(double t) {
		double a = t * 2.20462;
		return a;
	}
	public static double GallonsToLiters(double t) {
		double a = t * 3.78541;
		return a;
	}
	public static double LitersToGallons(double t) {
		double a = t * 0.264172;
		return a;
	}
}
