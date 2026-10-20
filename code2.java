import java.util.Scanner; // Imports the Scanner class to read user input[cite: 2]

public class code2 { // Declares a public class named W01_P2[cite: 2]
    public static void main(String[] strings) { // The main method where the program execution begins[cite: 2]
        double width; // Declares a double variable to store the width of the rectangle[cite: 2]
        double height; // Declares a double variable to store the height of the rectangle[cite: 2]

        Scanner in = new Scanner(System.in); // Creates a Scanner object to read input from the keyboard[cite: 2]
        width = in.nextDouble(); // Reads a double value from the user and assigns it to 'width'[cite: 2]
        height = in.nextDouble(); // Reads the next double value from the user and assigns it to 'height'[cite: 2]

        // Calculate the perimeter of the rectangle[cite: 2]
        double perimeter = 2 * (height + width); // Calculates perimeter using the formula 2 * (length + width)[cite: 2]

        // Calculate the area of the rectangle[cite: 2]
        double area = width * height; // Calculates area using the formula length * width[cite: 2]

        // Print the calculated perimeter using placeholders for values[cite: 2]
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f\n", height, width, perimeter); // Prints the formatted string for perimeter, replacing placeholders with variables[cite: 2]

        // Print the calculated area using placeholders for values[cite: 2]
        System.out.printf("Area is %.1f * %.1f = %.2f", width, height, area); // Prints the formatted string for area, replacing placeholders with variables[cite: 2]
    }
}