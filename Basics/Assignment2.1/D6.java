// Assignment 2.1 Question 4.a: Area to Radius Calculator
// Notes are in the class of Question 4.a: Area to Radius Calculator
import java.util.Scanner;

class D6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0, d7 = 0, d8 = 0, d9 = 0, d10 = 0;
        
        System.out.println("10 six-sided dice generator.");
        System.out.println(" ");
        
        d1 = (int) (Math.random() * 6 + 1);
        d2 = (int) (Math.random() * 6 + 1);
        d3 = (int) (Math.random() * 6 + 1);
        d4 = (int) (Math.random() * 6 + 1);
        d5 = (int) (Math.random() * 6 + 1);
        d6 = (int) (Math.random() * 6 + 1);
        d7 = (int) (Math.random() * 6 + 1);
        d8 = (int) (Math.random() * 6 + 1);
        d9 = (int) (Math.random() * 6 + 1);
        d10 = (int) (Math.random() * 6 + 1);
        
        System.out.println("The dice are " + d1 + ", " + d2 + ", " + d3 + ", " + d4 + ", " + d5 + ", " + d6 + ", " + d7 + ", " + d8 + ", " + d9 + ", " + d10 + ".");
    }
}
