import java.util.ArrayList;
import java.util.List;

public class FindVowelIndices {
    public static List<Integer> findVowelIndices(String str) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                indices.add(i);
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox";
        List<Integer> result = findVowelIndices(str);
        System.out.println("Vowel indices: " + result);
    }
}