import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0, temp = num, digits = String.valueOf(num).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        System.out.println(num + (sum == num ? " is an Armstrong Number." : " is not an Armstrong Number."));
        scanner.close();
    }
}
