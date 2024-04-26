package Day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Task9 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\sriwa\\Downloads\\DAY6 PROGRAMS & TASKS\\DAY6 PROGRAMS & TASKS");
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();
            String content = new String(data, "UTF-8");
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

