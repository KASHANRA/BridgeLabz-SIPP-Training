package level_1;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
public class ConvertByteStreamToCharacterStream {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\91731\\OneDrive\\Documents\\Full Stack Development\\node_modules\\nodemon\\doc\\cli\\usage.txt";
        try (
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr)
        )
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.err.println("Error reading the file:");
            e.printStackTrace();
        }
    }
}
