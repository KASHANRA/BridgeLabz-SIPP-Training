package level_1;
import java.util.*;
public class StudentCanVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateRandomAges(n);
        String[][] result = checkVotingEligibility(ages);
        displayResult(result);
    }

    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ageArray = new int[n];
        for (int i = 0; i < n; i++) {
            ageArray[i] = rand.nextInt(90) + 10;
        }
        return ageArray;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void displayResult(String[][] data) {
        System.out.printf("%-10s %-10s\n", "Age", "Can Vote");
        System.out.println("----------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s %-10s\n", data[i][0], data[i][1]);
        }
    }
}
