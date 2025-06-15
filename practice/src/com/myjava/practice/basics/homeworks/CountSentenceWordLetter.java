public class CountSentenceWordLetter {
    public static String countSentenceWordLetter(String paragraph) {
        int sentenceCount = paragraph.trim().split("\\.+\\s*").length;
        String[] words = paragraph.trim().split("\\s+");
        int wordCount = words.length;
        int letterCount = 0;
        for (char c : paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            }
        }
        return "Sentences: " + sentenceCount + ", Words: " + wordCount + ", Letters: " + letterCount;
    }

    public static void main(String[] args) {
        String paragraph = "This is sentence one. This is sentence two.";
        String result = countSentenceWordLetter(paragraph);
        System.out.println(result);
    }
}