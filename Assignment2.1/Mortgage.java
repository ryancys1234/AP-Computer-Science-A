// Assignment 2.1 Question 4.c: Mortgage Calculator
// Notes are in the class of Question 4.a: Area to Radius Calculator
import java.util.Scanner;

class Mortgage {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = 0;
        double r = 0;
        double n = 0;
        double A = 0;
        
        System.out.println("Mortgage Calculator.");
        System.out.println("Enter the principal...");
        System.out.println(" ");
        P = sc.nextDouble();
        
        
        System.out.println(" ");
        System.out.println("Enter the rate in percent...");
        System.out.println(" ");
        r= sc.nextDouble();
        
        
        System.out.println(" ");
        System.out.println("Enter the time in years...");
        System.out.println(" ");
        n = sc.nextDouble();
        
        A = (double) P * Math.pow((1 + (r / 100)), n);
        
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("The amount is $" + A + ".");
    }
}