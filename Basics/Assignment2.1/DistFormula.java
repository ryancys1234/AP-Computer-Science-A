// Assignment 2.1 Question 4.b: Distance Formula Calculator
// Notes are in the class of Question 4.a: Area to Radius Calculator
import java.util.Scanner;

class DistFormula {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        double d = 0;
        
        System.out.println("Distance Formula Calculator.");
        System.out.println("Enter the first x-coordinate.");
        System.out.println(" ");
        x1 = sc.nextDouble();
       
        
        System.out.println(" ");
        System.out.println("Enter the first y-coordinate.");
        System.out.println(" ");
        y1 = sc.nextDouble();
        
        
        System.out.println(" ");
        System.out.println("Enter the next x-coordinate.");
        System.out.println(" ");
        x2 = sc.nextDouble();
        
        
        System.out.println(" ");
        System.out.println("Enter the next y-coordinate.");
        System.out.println(" ");
        y2 = sc.nextDouble();
        
        d = (double) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("The distance is " + d + " units.");
    }
}
