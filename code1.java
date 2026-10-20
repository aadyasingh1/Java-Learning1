import java.util.Scanner; // Imports the Scanner class to read user input[cite: 1]

public class code1 { // Declares a public class named W01_P1[cite: 1]
    public static void main(String[] args) { // The main method where the program execution begins[cite: 1]
        Scanner in = new Scanner(System.in); // Creates a Scanner object named 'in' to read input from the standard input stream (keyboard)[cite: 1]
        int number = in.nextInt(); // Reads the next integer input from the user and stores it in the variable 'number'[cite: 1]
        
        // Check if the number is even or odd[cite: 1]
        if (number % 2 == 0) { // Checks if the remainder of 'number' divided by 2 is exactly 0. If true, the number is even.[cite: 1]
            System.out.print("Even"); // Prints "Even" to the console if the condition in the if statement is true[cite: 1]
        } else { // If the condition in the if statement is false (remainder is not 0), this block executes[cite: 1]
            System.out.print("Odd"); // Prints "Odd" to the console if the condition in the if statement is false[cite: 1]
        }
        
        in.close(); // Closes the Scanner object to free up system resources[cite: 1]
    }
}