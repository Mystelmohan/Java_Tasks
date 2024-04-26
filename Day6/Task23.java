package Day6;
import java.io.File;
public class Task23 {
    public static void main(String[] args) {
        File tempFile = new File("C:\\Users\\USER\\AppData\\Local\\Temp\\temp6937950274089969785.txt");
        if (tempFile.exists()) {
            if (tempFile.delete()) {
                System.out.println("Temporary file deleted successfully.");
            } else {
                System.out.println("Failed to delete temporary file.");
            }
        } else {
            System.out.println("Temporary file does not exist.");
        }
    }
}

