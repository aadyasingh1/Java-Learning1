import java.util.Scanner; // Imports the Scanner class to read user input[cite: 3]

public class W01_P3 { // Declares a public class named W01_P3[cite: 3]
    public static void main(String[] args) { // The main method where the program execution begins[cite: 3]
        Scanner in = new Scanner(System.in); // Creates a Scanner object named 'in' to read input from the standard input stream (keyboard)[cite: 3]
        double radius = in.nextDouble(); // Reads the next double input (radius) from the user[cite: 3]
        double height = in.nextDouble(); // Reads the next double input (height) from the user[cite: 3]

        // Calculates the volume of the cylinder using the formula V = pi * r^2 * h[cite: 3]
        double volume = Math.PI * radius * radius * height; // Math.PI provides the value of Pi[cite: 3]

        // Display the result
        System.out.printf("Volume is: %.2f", volume); // Prints the volume formatted to two decimal places[cite: 3]

        in.close(); // Closes the Scanner object to free up system resources[cite: 3]
    }
}