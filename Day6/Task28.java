package Day6;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Task28 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\USER\\AppData\\Local\\Temp\\temp112495527177858452690.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            String content = "This is the content that will be written to the file.\n";
            writer.write(content);
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
