package level01;
import java.util.*;
public class Twelfth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height: ");
		int h = sc.nextInt();
		System.out.print("Enter base: ");
		int b = sc.nextInt();
		System.out.println("The Area of the triangle in sq inch is " + (1/2f)*h*b*0.393701+ " and sq cm is " + (1/2f)*h*b);
	}

}
