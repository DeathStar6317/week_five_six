import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;

        // Step 1: Count digits
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        // Step 2: Store digits in array
        int[] digits = new int[count];
        temp = number;
        int index = 0;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        // Step 3: Frequency array (0–9)
        int[] freq = new int[10];

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        // Step 4: Display frequency
        System.out.println("Digit Frequencies:");

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}