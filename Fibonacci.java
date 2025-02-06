import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();
        int a = 0, b = 1, c;

        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < terms; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        scanner.close();
    }
}
