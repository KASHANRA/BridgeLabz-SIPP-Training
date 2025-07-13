package level_1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\91731\\OneDrive\\Documents\\Full Stack Development\\node_modules\\nodemon\\doc\\cli\\usage.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
