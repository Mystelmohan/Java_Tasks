package Day6;

import java.io.*;

class Task17 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[] {65, 66, 67, 68, 69};
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        InputStreamReader isr = new InputStreamReader(bais);
        BufferedReader br = new BufferedReader(isr);

    }
}

