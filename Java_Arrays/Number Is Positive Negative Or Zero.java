package level_1;
import java.util.*;
public class NumberIsPositiveNegativeOrZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int[5];
		System.out.print("Enter elements: ");
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > 0) {
				System.out.println("Positive Number");
				if(arr[i] % 2 == 0) {
					System.out.println("Even Number");
				}
				else {
					System.out.println("Odd Number");
				}
			}
			else if(arr[i] < 0) {
				System.out.println("Negative Number");
			}
			else {
				System.out.println("Zero");
			}
		}
		if(arr[0] == arr[arr.length - 1]) {
			System.out.println("1st and last elements of the Array are Equal");
		}
		else if(arr[0] > arr[arr.length - 1]) {
			System.out.println("1st element is Greater than last element");
		}
		else {
			System.out.println("1st element is Less than last element");
		}
	}
}
