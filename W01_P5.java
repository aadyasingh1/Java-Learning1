import java.util.Scanner; // Imports the Scanner class to read user input[cite: 5]

public class W01_P5 { // Declares a public class named W01_P5[cite: 5]
    public static void main(String[] args) { // The main method where the program execution begins[cite: 5]
        Scanner sc = new Scanner(System.in); // Creates a Scanner object named 'sc' to read input from the standard input stream (keyboard)[cite: 5]
        int x = sc.nextInt(); // Reads the first integer input from the user and stores it in the variable 'x'[cite: 5]
        int y = sc.nextInt(); // Reads the second integer input from the user and stores it in the variable 'y'[cite: 5]
        
        int quotient = x / y; // Calculates the quotient by dividing 'x' by 'y' using integer division[cite: 5]
        int remainder = x % y; // Calculates the remainder of 'x' divided by 'y' using the modulo operator[cite: 5]
        
        System.out.println("The Quotient is = " + quotient); // Prints the calculated quotient along with the descriptive text[cite: 5]
        System.out.println("The Remainder is = " + remainder); // Prints the calculated remainder along with the descriptive text[cite: 5]
        
        sc.close(); // Closes the Scanner object to free up system resources[cite: 5]
    }
}