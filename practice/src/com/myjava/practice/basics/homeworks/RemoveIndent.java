public class RemoveIndent {
    public static String removeIndent(String str) {
        String[] lines = str.split("\n");
        StringBuilder result = new StringBuilder();
        for (String line : lines) {
            result.append(line.trim()).append("\n");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String str = "    The quick\n  brown fox\n      jumps";
        String result = removeIndent(str);
        System.out.println("Without indent:\n" + result);
    }
}