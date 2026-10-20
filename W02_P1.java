import java.util.Scanner; // Imports the Scanner class to read user input[cite: 6]

public class W02_P1 { // Declares a public class named W02_P1[cite: 6]
    public static void main(String[] args) { // The main method where the program execution begins[cite: 6]
        Scanner sc = new Scanner(System.in); // Creates a Scanner object named 'sc' to read input from the standard input stream (keyboard)[cite: 6]
        
        // Read length and width of the rectangle[cite: 6]
        int length = sc.nextInt(); // Reads the next integer input (length) from the user[cite: 6]
        int width = sc.nextInt(); // Reads the next integer input (width) from the user[cite: 6]
        
        int area = length * width; // Calculates the area by multiplying length and width[cite: 6]
        
        // Print the area[cite: 6]
        System.out.print("Area is: " + area); // Prints the calculated area to the console[cite: 6]
        
        sc.close(); // Closes the Scanner object to free up system resources[cite: 6]
    }
}