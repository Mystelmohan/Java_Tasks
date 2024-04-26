package Day6;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class Task25 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\USER\\AppData\\Local\\Temp\\temp112495527177858452690.txt";
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
            int data;
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

