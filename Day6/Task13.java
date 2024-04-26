package Day6;

import java.io.*;
import java.util.Properties;

class Task13 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("key1", "value1");
        prop.setProperty("key2", "value2");

        try {
            FileOutputStream fos = new FileOutputStream("config.properties");
            prop.store(fos, "Properties File");
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
