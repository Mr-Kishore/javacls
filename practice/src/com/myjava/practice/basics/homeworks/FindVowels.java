import java.util.ArrayList;
import java.util.List;

public class FindVowels {
    public static List<Character> findVowels(String str) {
        List<Character> vowels = new ArrayList<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels.add(c);
            }
        }
        return vowels;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox";
        List<Character> result = findVowels(str);
        System.out.println("Vowels: " + result);
    }
}