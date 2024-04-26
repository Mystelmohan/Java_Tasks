package Day6;
import java.io.File;
import java.io.IOException;

public class Task21 {
    public static void main(String[] args) throws IOException {
        try {
            File tempFile = File.createTempFile("temp", ".txt");
            String tempFilePath = tempFile.getAbsolutePath();
            System.out.println("Temporary file path: " + tempFilePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}