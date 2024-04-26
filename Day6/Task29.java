package Day6;
import java.io.FileWriter;
import java.io.IOException;
public class Task29 {

        public static void main(String[] args) {
            String filePath = "C:\\Users\\USER\\AppData\\Local\\Temp\\temp112495527177858452690.txt";
            try (FileWriter writer = new FileWriter(filePath, true)) {
                String content = "This is new content that will be appended to the file.\n";
                writer.write(content);
                System.out.println("Data has been appended to the file successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while appending to the file: " + e.getMessage());
            }
        }
    }

}
