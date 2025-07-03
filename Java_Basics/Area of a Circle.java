package Lec_1;
import java.util.*;
public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius:");
        int r = sc.nextInt();
        double a = (Math.PI * r * r);
        System.out.println("Area is: " + a);
    }
}
