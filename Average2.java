import java.util.Scanner;
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class  Average2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0, count = 0;

        System.out.print("Enter the number of integers: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter integer #" + i + ": ");
            int number = scanner.nextInt();

            try {
                if (number < 0) {
                    throw new NegativeNumberException("Negative input not allowed: " + number);
                }
                sum += number;
                count++;
            } catch (NegativeNumberException e) {
                System.out.println("Exception caught: " + e.getMessage());
                scanner.close();
                return;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of positive integers: " + average);
        } else {
            System.out.println("No positive integers entered. Cannot compute average.");
        }

        scanner.close();
    }
}
