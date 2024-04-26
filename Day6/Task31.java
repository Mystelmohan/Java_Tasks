package Day6;

import java.io.File;
/**
 * Task31
 */
public class Task31 {
    public static void main(String[] args) {
        File f1;
        File f2;
        boolean ans;
        try{
            f1=new File("E:\\java training\\Java_Tasks\\Day6\\hi.txt");
            f2=new File("E:\\java training\\Java_Tasks\\Day6\\welcome.txt");
            ans=f1.renameTo(f2);
            System.out.println("Status renamed = "+ans);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}