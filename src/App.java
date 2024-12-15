import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your value: ");
        
        int end = scanner.nextInt();
        System.out.println();

        for (int i = 1; i <= end; i++) {
            StringBuilder result = new StringBuilder();
            if (i % 3 == 0) result.append("Fizz");
            if (i % 5 == 0) result.append("Buzz");
            System.out.print(result.isEmpty() ? i + "; " : result + "; ");
        }

        scanner.close();
    }
}