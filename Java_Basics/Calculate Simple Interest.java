package Lec_1;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter P: ");
        int p = sc.nextInt();
        System.out.print("Enter R: ");
        int r = sc.nextInt();
        System.out.print("Enter T: ");
        int t = sc.nextInt();
        System.out.print("SI is: " + (p*r*t)/100);
    }
}
