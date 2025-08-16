// Various ways to use github copilot in VS Code
// 1. Inline Suggestions: As you type, Copilot suggests whole lines or blocks of code.
// 2. Command Palette: Access Copilot features through the command palette (Ctrl+Shift+P).
// 3. Contextual Suggestions: Copilot uses the context of your code to provide relevant suggestions.
// 4. Multi-line Support: Copilot can handle and suggest multi-line code snippets.
// 5. Language Support: Works with various programming languages and frameworks.

// Write a simple Java program to convert INR to USD using excahnge rate on 15th August 2025 and use the precision to 3 decimals    
import java.util.Scanner;
public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exchange rate on 15th August 2025
        double exchangeRate = 0.012; // Example rate: 1 INR = 0.012 USD
        
        System.out.print("Enter amount in INR: ");
        double amountInINR = scanner.nextDouble();
        
        // Convert INR to USD
        double amountInUSD = amountInINR * exchangeRate;
        
        // Print the result with precision of 3 decimals
        System.out.printf("Amount in USD: %.3f%n", amountInUSD);
        
        scanner.close();
    }
}







// Prompt 1: Bring me the food
// Prompt 2: Get me a chicken burger with sides of fried, mustard sauce, ketchup, and a drink of diet coke 
