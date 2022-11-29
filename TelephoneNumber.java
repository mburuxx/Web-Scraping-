import java.util.Scanner;

public class TelephoneNumber {
    public static void main(String[] args) {
        int[] numberCount = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phone number: ");
        String phoneNumber = input.nextLine();
        for (int i = 0; i &lt; phoneNumber.length(); i++) {
            if (Character.isDigit(phoneNumber.charAt(i))) {
                int digit = Character.getNumericValue(phoneNumber.charAt(i));
                numberCount[digit]++;
            }
        }
        for (int i = 0; i &lt; numberCount.length; i++) {
            if (numberCount[i] != 0) {
                System.out.println(i + " occurs " + numberCount[i] +
                    (numberCount[i] &gt; 1 ? " times" : " time"));
            }
        }
    }
}