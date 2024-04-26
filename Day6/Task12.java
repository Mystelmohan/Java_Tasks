package Day6;
import java.io.*;

    class Task12 {
        public static void main(String[] args) {
            // Storing objects
            try {
                FileOutputStream fos = new FileOutputStream("objects.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                MyClass obj = new MyClass();
                oos.writeObject(obj);
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Reading objects
            try {
                FileInputStream fis = new FileInputStream("objects.dat");
                ObjectInputStream ois = new ObjectInputStream(fis);
                MyClass obj = (MyClass) ois.readObject();
                ois.close();
                fis.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

}
