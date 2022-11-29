
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your favorite number: ");
            String number = input.nextLine();
            boolean isNumber = true;
            for (int i = 0; i < number.length(); i++) {
                if (!Character.isDigit(number.charAt(i))) {
                    isNumber = false;
                    break;
                }
            }
            if (!isNumber) {
                System.out.println("Letter found");
            } else if (number.equals("16")) {
                System.out.println("It is your lucky day!");
            } else {
                System.out.println("Good lucky number");
            }
        }
    }
}