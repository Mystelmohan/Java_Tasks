package Day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task10 {
    public static void main(String[] args) {
            try {
                File file = new File("C:\\Users\\sriwa\\Downloads\\DAY6 PROGRAMS & TASKS\\DAY6 PROGRAMS & TASKS\\Task.txt");
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

