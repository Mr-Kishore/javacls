public class ToCamelCase {
    public static String toCamelCase(String sentence) {
        String[] words = sentence.trim().toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                result.append(word);
            } else {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox";
        String result = toCamelCase(sentence);
        System.out.println("Camel case: " + result);
    }
}