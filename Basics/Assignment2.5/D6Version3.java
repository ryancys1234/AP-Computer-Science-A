import java.util.Scanner;

class D6Version3 {
    public static int rollDie(int sides) {
       return (int) (Math.random() * sides + 1);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        String yn = "";
        int num = 0, s = 0, d = 0, sum = 0;

        while (run) {
            System.out.println("Please indicate the number of dice to be rolled.");
            num = sc.nextInt();
            
            System.out.println("Please indicate the number of sides of these dice.");
            s = sc.nextInt();

            System.out.print("You rolled: ");

            for (int x = 1; x <= num; x++) {
                System.out.print(rollDie(s) + " ");

                sum += rollDie(s);
            }

            System.out.println("");
            System.out.println("Sum of dices: " + sum);
            System.out.println("");
            System.out.println("Again? Indicate y for yes and n for no.");

            yn = sc.next();

            if (yn.equals("y")) {
                sum = 0;
                run = true;
            } else if (yn.equals("n")) {
                run = false;
            } else {
                System.out.println("Please type either y or n.");
            }
        }
        System.out.println("Goodbye!");
    }
}