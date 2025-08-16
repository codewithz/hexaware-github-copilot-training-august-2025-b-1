public class FibonacciSeries {
    public static void main(String[] args) {
        try {
            int a = 0, b = 1;
            System.out.print("Fibonacci series from 0 to 100: ");
            while (a <= 100) {
                System.out.print(a + " ");
                int next = a + b; // Safe for values up to 100
                a = b;
                b = next;
            }
        } catch (ArithmeticException ex) {
            System.out.println("\nError: Integer overflow occurred in Fibonacci calculation.");
        } catch (Exception ex) {
            System.out.println("\nAn unexpected error occurred: " + ex.getMessage());
        }
    }
    
}
