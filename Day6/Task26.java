package Day6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Task26 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\USER\\AppData\\Local\\Temp\\temp112495527177858452690.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
