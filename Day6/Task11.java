package Day6;
import java.io.File;
import java.util.*;
public class Task11 {
    public static void main(String[] args) {
        String folderPath = "your_folder_path";

        String extension = ".txt";

        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        List<String> filteredFiles = new ArrayList<>();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(extension)) {
                    filteredFiles.add(file.getName());
                }
            }
        }

        for (String fileName : filteredFiles) {
            System.out.println(fileName);
        }
    }
}
