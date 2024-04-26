package Day6;

import java.io.File;

public class Task8 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\sriwa\\Downloads\\DAY6 PROGRAMS & TASKS\\DAY6 PROGRAMS & TASKS");
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}

