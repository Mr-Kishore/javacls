import java.util.HashMap;
import java.util.Map;

public class MostRepeatedCharacter {
    public static char mostRepeatedCharacter(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox";
        char result = mostRepeatedCharacter(str);
        System.out.println("Most repeated character: " + result);
    }
}