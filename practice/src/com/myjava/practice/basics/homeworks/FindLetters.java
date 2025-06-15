import java.util.ArrayList;
import java.util.List;

public class FindLetters {
    public static List<Character> findLetters(String sentence) {
        List<Character> letters = new ArrayList<>();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }
        return letters;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        List<Character> result = findLetters(sentence);
        System.out.println("Letters: " + result);
    }
}