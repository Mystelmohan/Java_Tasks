package Day6;

import java.io.*;

class Task20 {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file.txt"));
            int data;
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
