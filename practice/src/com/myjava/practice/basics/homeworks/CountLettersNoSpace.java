public class CountLettersNoSpace {
    public static int countLettersNoSpace(String sentence) {
        int count = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        int result = countLettersNoSpace(sentence);
        System.out.println("Letter count (no spaces): " + result);
    }
}