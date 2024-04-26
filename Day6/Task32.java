package Day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task32 {
    public static void main(String[] args) {
        FileInputStream f1 = null;
        FileOutputStream f2 = null;
        try {
            f1 = new FileInputStream("E:/java training/Java_Tasks/Day6/welcome.txt");
            f2 = new FileOutputStream("E:/java training/Java_Tasks/Day6/hello.txt");

            int c;
            while ((c = f1.read()) != -1) {
                f2.write(c);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (f1 != null) {
                    f1.close();
                }
                if (f2 != null) {
                    f2.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
