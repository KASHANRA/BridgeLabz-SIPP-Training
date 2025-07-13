package level_1;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadUserInputAndWriteToFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\91731\\OneDrive\\Documents\\Full Stack Development\\node_modules\\nodemon\\doc\\cli\\user_input.txt";
        try (
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter writer = new FileWriter(filePath, true)
        )
        {
            System.out.println("Enter text to write to the file (type 'exit' to finish):");
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                if (inputLine.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting and saving input to file.");
                    break;
                }
                writer.write(inputLine + System.lineSeparator());
            }
        }
        catch (IOException e) {
            System.err.println("An error occurred while reading input or writing to the file:");
            e.printStackTrace();
        }
    }
}
