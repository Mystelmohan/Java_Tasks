package Day6;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Task33 {
    public static void main(String[] args) {
        File file1=new File("E:/java training/Java_Tasks/Day6/welcome.txt");
        long time1 = file1.lastModified();
      
        DateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");
       
        System.out.println("GFG.java modified date is : "
                           + sdf.format(time1));
       
    }
}
