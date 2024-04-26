package Day6;
import java.io.FileOutputStream;
import java.io.IOException;
public class Task24 {
    public static void main(String[] args) {
        String strContent = "Hello, this is a string content.";
        byte[] byteContent = {72, 101, 108, 108};
        try {
            FileOutputStream stringOutputStream = new FileOutputStream("string_content.txt");
            stringOutputStream.write(strContent.getBytes());
            System.out.println("String content written to file successfully.");
            FileOutputStream byteOutputStream = new FileOutputStream("byte_content.txt");
            byteOutputStream.write(byteContent);
            System.out.println("Byte content written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
