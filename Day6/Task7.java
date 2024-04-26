package Day6;

import java.io.File;

public class Task7 {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\sriwa\\Downloads\\DAY6 PROGRAMS & TASKS\\DAY6 PROGRAMS & TASKS";
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    System.out.println(files[i].getName());
                }
            }
        } else {
            System.out.println("Folder does not exist or is empty.");
        }
    }
}
