import java.util.Scanner;

class GuessingGame {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random() * 100 + 1);
        int x = 0, tries = 0;

        System.out.println("A random number between 1 and 100, inclusive, has been picked.");

        while (x != random) {
            System.out.println("What is your guess?");
            x = sc.nextInt();

            if (x > random) {
                System.out.println("Too high. Try again.");
            } else if (x < random) {
                System.out.println("Too low. Try again.");
            }
            
            tries++;
        }
        
        System.out.println("You guessed it! It took you " + tries + " tries.");
    }
}