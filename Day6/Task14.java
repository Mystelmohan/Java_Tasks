package Day6;
import java.io.File;
import java.util.Date;

class Task14 {
    public static void main(String[] args) {
        File file = new File("your_file_path");
        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println("Last Modified Time: " + date);
    }
}
