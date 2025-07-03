package Lec_1;

import java.util.*;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        float v = 22.0f/7 * r * r * h;
        System.out.println("Volume is: " + v);
    }
}
