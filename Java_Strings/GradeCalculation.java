package level_1;
import java.util.*;
public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);
        displayScorecard(scores, results, grades);
    }

    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            marks[i][0] = rand.nextInt(41) + 60;
            marks[i][1] = rand.nextInt(41) + 60;
            marks[i][2] = rand.nextInt(41) + 60;
        }
        return marks;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double p = results[i][2];
            if (p >= 80.0) {
                grades[i] = "Level 4, above agency-normalized standards";
            } else if (p >= 70.0) {
                grades[i] = "Level 3, at agency-normalized standards";
            } else if (p >= 60.0) {
                grades[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (p >= 50.0) {
                grades[i] = "Level 1, well below agency-normalized standards";
            } else if (p >= 40.0) {
                grades[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i] = "Remedial standards";
            }
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-5s %-8s %-10s %-8s %-8s %-10s %-12s %-45s\n",
                "ID", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-5d %-8d %-10d %-8d %-8.0f %-10.2f %-12.2f %-45s\n",
                    (i + 1),
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grades[i]);
        }
    }
}
