public class BreakAndContinue{
    public static void main(String[] args) {
        // Example of break statement
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i = 5
            }
            System.out.print(i + " ");
        }
        System.out.println("\nLoop complete.");

        // Example of continue statement
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip this iteration when i = 5
            }
            System.out.print(i + " ");
        }
        System.out.println("\nLoop complete.");
    }
}
