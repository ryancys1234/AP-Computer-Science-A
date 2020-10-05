// Assignment 2.1 Question 4.a: Area to Radius Calculator
import java.util.Scanner; // Scans terminal

class AreaToRadius {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); // System.in reads the terminal
        double a = 0; // Initialize variables to 0 to mitigate the effects of errors
        double r = 0;
        
        System.out.println("Area to Radius Calculator. Enter the area of the circle.");
        System.out.println(" ");
        a = sc.nextDouble();
        
        r = (double) Math.sqrt(a / Math.PI);
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("The radius is " + r + " units."); // The + is a concatenation operator
    }
}
