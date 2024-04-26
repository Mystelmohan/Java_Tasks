package Day6;
import java.io.File;
public class Task30 {
    public static void main(String[] args) {
        String filePath = "path_to_your_file";
        File fileToDelete = new File(filePath);
        if (fileToDelete.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
