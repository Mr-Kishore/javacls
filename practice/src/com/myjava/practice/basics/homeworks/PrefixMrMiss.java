import java.util.Arrays;

public class PrefixMrMiss {
    public static String[] prefixMrMiss(String[] names) {
        String[] result = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            result[i] = (i % 2 == 0 ? "Mr." : "Miss.") + names[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Bob", "Alice"};
        String[] result = prefixMrMiss(names);
        System.out.println("Prefixed names: " + Arrays.toString(result));
    }
}