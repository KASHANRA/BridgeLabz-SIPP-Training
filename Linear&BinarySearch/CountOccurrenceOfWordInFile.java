package level_1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CountOccurrenceOfWordInFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\91731\\OneDrive\\Documents\\Full Stack Development\\node_modules\\nodemon\\doc\\cli\\usage.txt";
        String targetWord = "node"; 
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (word.equals(targetWord.toLowerCase())) {
                        count++;
                    }
                }
            }
            System.out.println("The word \"" + targetWord + "\" occurred " + count + " times.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
