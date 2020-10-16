import java.util.Scanner;

class D6Version2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        String yn = "";
        int x = 0, d = 0, sum = 0;

        while (run) {
            System.out.println("Please indicate the number of dices to be rolled.");
            x = sc.nextInt();

            System.out.print("You rolled: ");

            for (int n = 1; n <= x; n++) {
                d = (int) (Math.random() * 6 + 1);
                System.out.print(d + " ");

                sum += d;
            }

            System.out.println("");
            System.out.println("Sum of dices: " + sum);
            System.out.println("");
            System.out.println("Again? Indicate y for yes and n for no.");
            System.out.println("");

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