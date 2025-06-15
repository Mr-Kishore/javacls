import java.util.HashSet;
import java.util.Set;

public class FindUniqueLetters {
    public static Set<Character> findUniqueLetters(String sentence) {
        Set<Character> uniqueLetters = new HashSet<>();
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueLetters.add(c);
            }
        }
        return uniqueLetters;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        Set<Character> result = findUniqueLetters(sentence);
        System.out.println("Unique letters: " + result);
    }
}