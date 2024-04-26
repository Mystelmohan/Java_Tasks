package Day6;

import java.io.File;

class Task19 {
    public static void main(String[] args) {
        File file = new File("your_file_path");
        file.setReadable(true); // Set file readable
        file.setWritable(true); // Set file writable
        file.setExecutable(false); // Set file not executable
    }
}
