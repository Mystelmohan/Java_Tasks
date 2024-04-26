package Day6;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Task22 {
        public static void main(String[] args) {
            try {
                File tempFile = File.createTempFile("temp1", ".txt");
                FileWriter writer = new FileWriter(tempFile);
                writer.write("Hello, this is a temporary file!");
                System.out.println("Data written to temporary file: " + tempFile.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the temporary file: " + e.getMessage());
            }
        }
    }

