public class CountSentences {
    public static int countSentences(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) return 0;
        String[] sentences = paragraph.trim().split("\\.+\\s*");
        return sentences.length;
    }

    public static void main(String[] args) {
        String paragraph = "This is sentence one. This is sentence two. This is sentence three.";
        int result = countSentences(paragraph);
        System.out.println("Sentence count: " + result);
    }
}