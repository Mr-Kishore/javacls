import java.util.*;
import java.util.stream.Collectors;

public class Master {
    // 1. Find words in a sentence
    public static String[] findWords(String sentence) {
        return sentence.trim().split("\\s+");
    }

    // 2. Find letters in a sentence
    public static List<Character> findLetters(String sentence) {
        List<Character> letters = new ArrayList<>();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }
        return letters;
    }

    // 3. Count letters without spaces
    public static int countLettersNoSpace(String sentence) {
        int count = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    // 4. Find unique letters
    public static Set<Character> findUniqueLetters(String sentence) {
        Set<Character> uniqueLetters = new HashSet<>();
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueLetters.add(c);
            }
        }
        return uniqueLetters;
    }

    // 5. Convert sentence to camel case
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

    // 6. Count sentences in a paragraph
    public static int countSentences(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) return 0;
        String[] sentences = paragraph.trim().split("\\.+\\s*");
        return sentences.length;
    }

    // 7. Count sentences, words, and letters
    public static String countSentenceWordLetter(String paragraph) {
        int sentenceCount = countSentences(paragraph);
        String[] words = paragraph.trim().split("\\s+");
        int wordCount = words.length;
        int letterCount = countLettersNoSpace(paragraph);
        return "Sentences: " + sentenceCount + ", Words: " + wordCount + ", Letters: " + letterCount;
    }

    // 8. Find most repeated character
    public static char mostRepeatedCharacter(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return maxChar;
    }

    // 9. Find least repeated word
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

    // 10. Find vowels
    public static List<Character> findVowels(String str) {
        List<Character> vowels = new ArrayList<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels.add(c);
            }
        }
        return vowels;
    }

    // 11. Prefix Mr./Miss. to alternate names
    public static String[] prefixMrMiss(String[] names) {
        String[] result = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            result[i] = (i % 2 == 0 ? "Mr." : "Miss.") + names[i];
        }
        return result;
    }

    // 12. Append degree to name
    public static String nameWithDegree(String name, String degree) {
        return name + ", " + degree;
    }

    // 13. Find building names starting with 'S'
    public static List<String> findBuildingsWithS(String[] buildings) {
        List<String> result = new ArrayList<>();
        for (String building : buildings) {
            if (building.toLowerCase().startsWith("s")) {
                result.add(building);
            }
        }
        return result;
    }

    // 14. Find indices of vowels
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

    // 15. Remove indent from string
    public static String removeIndent(String str) {
        String[] lines = str.split("\n");
        StringBuilder result = new StringBuilder();
        for (String line : lines) {
            result.append(line.trim()).append("\n");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nString Manipulator Menu:");
            System.out.println("1. Find words in a sentence");
            System.out.println("2. Find letters in a sentence");
            System.out.println("3. Count letters (no spaces)");
            System.out.println("4. Find unique letters");
            System.out.println("5. Convert to camel case");
            System.out.println("6. Count sentences in a paragraph");
            System.out.println("7. Count sentences, words, and letters");
            System.out.println("8. Find most repeated character");
            System.out.println("9. Find least repeated word");
            System.out.println("10. Find vowels");
            System.out.println("11. Prefix Mr./Miss. to names");
            System.out.println("12. Append degree to name");
            System.out.println("13. Find buildings starting with 'S'");
            System.out.println("14. Find vowel indices");
            System.out.println("15. Remove indent from string");
            System.out.println("16. Exit");
            System.out.print("Enter choice (1-16): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 16.");
                continue;
            }

            if (choice == 16) {
                System.out.println("Exiting program.");
                break;
            }

            if (choice < 1 || choice > 16) {
                System.out.println("Invalid choice. Please select between 1 and 16.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter sentence: ");
                    String sentence1 = scanner.nextLine();
                    System.out.println("Words: " + Arrays.toString(findWords(sentence1)));
                    break;
                case 2:
                    System.out.print("Enter sentence: ");
                    String sentence2 = scanner.nextLine();
                    System.out.println("Letters: " + findLetters(sentence2));
                    break;
                case 3:
                    System.out.print("Enter sentence: ");
                    String sentence3 = scanner.nextLine();
                    System.out.println("Letter count (no spaces): " + countLettersNoSpace(sentence3));
                    break;
                case 4:
                    System.out.print("Enter sentence: ");
                    String sentence4 = scanner.nextLine();
                    System.out.println("Unique letters: " + findUniqueLetters(sentence4));
                    break;
                case 5:
                    System.out.print("Enter sentence: ");
                    String sentence5 = scanner.nextLine();
                    System.out.println("Camel case: " + toCamelCase(sentence5));
                    break;
                case 6:
                    System.out.print("Enter paragraph: ");
                    String paragraph6 = scanner.nextLine();
                    System.out.println("Sentence count: " + countSentences(paragraph6));
                    break;
                case 7:
                    System.out.print("Enter paragraph: ");
                    String paragraph7 = scanner.nextLine();
                    System.out.println(countSentenceWordLetter(paragraph7));
                    break;
                case 8:
                    System.out.print("Enter string: ");
                    String str8 = scanner.nextLine();
                    System.out.println("Most repeated character: " + mostRepeatedCharacter(str8));
                    break;
                case 9:
                    System.out.print("Enter sentence: ");
                    String sentence9 = scanner.nextLine();
                    System.out.println("Least repeated word: " + leastRepeatedWord(sentence9));
                    break;
                case 10:
                    System.out.print("Enter string: ");
                    String str10 = scanner.nextLine();
                    System.out.println("Vowels: " + findVowels(str10));
                    break;
                case 11:
                    System.out.print("Enter names (comma-separated): ");
                    String[] names11 = scanner.nextLine().split(",\\s*");
                    System.out.println("Prefixed names: " + Arrays.toString(prefixMrMiss(names11)));
                    break;
                case 12:
                    System.out.print("Enter name: ");
                    String name12 = scanner.nextLine();
                    System.out.print("Enter degree: ");
                    String degree12 = scanner.nextLine();
                    System.out.println("Result: " + nameWithDegree(name12, degree12));
                    break;
                case 13:
                    System.out.print("Enter building names (comma-separated): ");
                    String[] buildings13 = scanner.nextLine().split(",\\s*");
                    System.out.println("Buildings starting with S: " + findBuildingsWithS(buildings13));
                    break;
                case 14:
                    System.out.print("Enter string: ");
                    String str14 = scanner.nextLine();
                    System.out.println("Vowel indices: " + findVowelIndices(str14));
                    break;
                case 15:
                    System.out.print("Enter string (use \\n for new lines): ");
                    String str15 = scanner.nextLine();
                    System.out.println("Without indent:\n" + removeIndent(str15));
                    break;
            }
        }
        scanner.close();
    }
        }
