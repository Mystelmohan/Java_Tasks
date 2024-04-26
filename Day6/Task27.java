package Day6;
import java.io.FileOutputStream;
import java.io.IOException;
public class Task27 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\USER\\AppData\\Local\\Temp\\temp112495527177858452690.txt";
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            String content = "This is the content that will be written to the file.";
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}

