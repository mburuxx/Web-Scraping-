import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        int[] counts = new int[10];
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = input.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    counts[str.charAt(i) - '0']++;
                }
            }
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + ": " + counts[i]);
        }
    }
}