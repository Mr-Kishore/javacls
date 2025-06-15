import java.util.HashMap;
import java.util.Map;

public class LeastRepeatedWord {
    public static String leastRepeatedWord(String sentence) {
        String[] words = sentence.trim().toLowerCase().split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        String leastWord = "";
        int minCount = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() < minCount) {
                leastWord = entry.getKey();
                minCount = entry.getValue();
            }
        }
        return leastWord;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox the quick";
        String result = leastRepeatedWord(sentence);
        System.out.println("Least repeated word: " + result);
    }
}