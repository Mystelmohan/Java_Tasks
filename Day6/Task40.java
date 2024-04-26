package Day6;

import java.util.HashMap;
import java.util.Map;

public class Task40 {
    public static void main(String[] args) {
        String str = "Hello World";
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        char maxChar = '\0'; 
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Max occurring character: " + maxChar);
        System.out.println("count: " + maxCount);
    }
}
