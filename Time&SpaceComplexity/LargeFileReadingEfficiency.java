package level_1;
import java.io.*;
public class LargeFileReadingEfficiency {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\91731\\OneDrive\\Documents\\Full Stack Development\\node_modules\\nodemon\\doc\\cli\\usage.txt";
        long[] fileSizes = {1024 * 1024, 100 * 1024 * 1024, 500 * 1024 * 1024};       
        for (long fileSize : fileSizes) {
            System.out.println("File size: " + fileSize / (1024 * 1024) + "MB");            
            try {
                long startTime = System.nanoTime();
                readFileUsingFileReader(filePath, fileSize);
                long endTime = System.nanoTime();
                System.out.println("FileReader time: " + (endTime - startTime) / 1000000 + " ms");
                startTime = System.nanoTime();
                readFileUsingInputStreamReader(filePath, fileSize);
                endTime = System.nanoTime();
                System.out.println("InputStreamReader time: " + (endTime - startTime) / 1000000 + " ms");
                System.out.println();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readFileUsingFileReader(String filePath, long fileSize) throws IOException {
        FileReader fr = new FileReader(filePath);
        char[] buffer = new char[8192];
        int charsRead;
        while ((charsRead = fr.read(buffer)) != -1) {
        }
        fr.close();
    }

    public static void readFileUsingInputStreamReader(String filePath, long fileSize) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        InputStreamReader isr = new InputStreamReader(fis);
        char[] buffer = new char[8192];
        int charsRead;
        while ((charsRead = isr.read(buffer)) != -1) {
        }
        isr.close();
    }
}
