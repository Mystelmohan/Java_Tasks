package Day6;

import java.io.File;

public class Task35 {
    public static void main(String[] args) {
        String filePath = "E:/java training/Java_Tasks/Day6/welcome.txt";
        File file = new File(filePath);
        if (file.isHidden()) {
            System.out.println("The file is hidden.");
        } else {
            System.out.println("The file is not hidden.");
        }
    }
}
