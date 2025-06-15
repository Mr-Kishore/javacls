import java.util.Scanner;

public class NameWithDegree {
    public static String nameWithDegree(String name, String degree) {
        return name + ", " + degree;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter degree: ");
        String degree = scanner.nextLine();
        String result = nameWithDegree(name, degree);
        System.out.println("Result: " + result);
        scanner.close();
    }
}