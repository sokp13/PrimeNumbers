import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    public static void main(String args[]){
        // Keyboard
        Scanner kb = new Scanner(System.in);

        // Create the new 'Prime' object
        Prime Tester = new Prime();
        System.out.println("Enter a number to test if Prime: ");

        // Running the input
        int test = kb.nextInt();
        boolean result = Tester.isPrime(test);

        // Print the result
        System.out.println(result);
    }
}