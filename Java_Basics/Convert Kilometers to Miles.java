package Lec_1;

import java.util.Scanner;

public class tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kilometres: ");
        int k = sc.nextInt();
        System.out.println(k + " kilometres" + " = " + k * 0.621371 + " miles");
    }
}
