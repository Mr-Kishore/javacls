import java.util.Arrays;

public class FindWords {
    public static String[] findWords(String sentence) {
        return sentence.trim().split("\\s+");
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String[] result = findWords(sentence);
        System.out.println("Words: " + Arrays.toString(result));
    }
}