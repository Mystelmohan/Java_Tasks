package Day6;

import java.io.File;

public class Task34 {
    public static void main(String[] args) {
        boolean flag;
       
        try {
           
            File file = new File("E:/java training/Java_Tasks/Day6/welcome.txt");
           
            // creates a new file
            file.createNewFile();
           
            // flag the file to be read-only
            flag = file.setReadOnly();
           
            System.out.println("Is File is read-only ? : "
                               + flag);
           
            // checking whether Is file  writable
            flag = file.canWrite();
            System.out.println("Is File is writable ? : "
                               + flag);
        }
       
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
