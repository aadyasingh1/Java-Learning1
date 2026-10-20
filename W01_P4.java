import java.util.Scanner; // Imports the Scanner class to read user input[cite: 4]

public class W01_P4 { // Declares a public class named W01_P4[cite: 4]
    public static void main(String[] args) { // The main method where the program execution begins[cite: 4]
        Scanner in = new Scanner(System.in); // Creates a Scanner object named 'in' to read input from the standard input stream (keyboard)[cite: 4]
        int number = in.nextInt(); // Reads the next integer input from the user and stores it in the variable 'number'[cite: 4]
        
        // Print the multiplication table[cite: 4]
        for (int i = 1; i < 5; i++) { // Starts a loop with 'i' at 1, continues as long as 'i' is less than 5, and increments 'i' by 1 each iteration[cite: 4]
            System.out.printf("%d x %d = %d\n", number, i, number * i); // Prints the multiplication expression in the exact required format using placeholders[cite: 4]
        }
        
        in.close(); // Closes the Scanner object to free up system resources[cite: 4]
    }
}