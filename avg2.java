import java.util.*;

// Custom exception for negative numbers
class Negative extends ArithmeticException {
    Negative(String s) {
        super(s);
    }
}

public class avg2 {
    // Method to check and calculate average
    static void check(int num) throws Negative {
        int[] a = new int[20];
        int sum = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            if (n < 0) {
                throw new Negative("Number is negative: " + n);
            }
            a[i] = n;
            sum += a[i];
            count++;
        }

        double avg = (double) sum / count;
        System.out.println("Average of positive numbers: " + avg);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int num = sc.nextInt();

        try {
            check(num);
        } catch (Negative e) {
            System.out.println(e);
        }

        System.out.println("Program terminated");
    }
}

