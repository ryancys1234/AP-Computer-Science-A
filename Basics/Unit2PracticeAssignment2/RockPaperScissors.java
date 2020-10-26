import java.util.Scanner;

class RockPaperScissors {
    final static int rock = 1, paper = 2, scissors = 3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playerChoice = 0, computerChoice = 0;
        int wins = 0, losses = 0, ties = 0;
        boolean run = true, valid123 = false, validYN = false; // The characters after "valid" in the boolean variable names indicate the valid responses for each.

        System.out.println("RockPaperScissors 1.0");
        System.out.println("********************************");
        System.out.println("Good luck!");
        System.out.println("");

        while (run) {
            run = false;
            computerChoice = (int) (Math.random() * 3 + 1);
            System.out.println("What do you choose?");

            while (valid123 == false) {
                valid123 = true;
                System.out.print("[1] Rock, [2] Paper, [3] Scissors ");
                playerChoice = sc.nextInt();

                if (playerChoice == rock) System.out.print("You threw rock! ");
                else if (playerChoice == paper) System.out.print("You threw paper! ");
                else if (playerChoice == scissors) System.out.print("You threw scissors! ");
                else {
                    System.out.print("Invalid response. Please choose between: ");
                    valid123 = false;
                }
            }

            valid123 = false;

            if (computerChoice == rock) System.out.println("I threw rock! ");
            else if (computerChoice == paper) System.out.println("I threw paper! ");
            else if (computerChoice == scissors) System.out.println("I threw scissors! ");

            if (playerChoice == computerChoice + 1 || (playerChoice == rock && computerChoice == scissors)) {
                System.out.println("You win!");
                wins++;
            } else if (computerChoice == playerChoice + 1 || (computerChoice == rock && playerChoice == scissors)) {
                System.out.println("I win!");
                losses++;
            } else if (playerChoice == computerChoice) {
                System.out.println("A tie!");
                ties++;
            }

            while (validYN == false) {
                System.out.print("Play again? [Y] Yes, [N] No ");
                String yn = sc.next();
                validYN = true;

                if (yn.equals("Y") || yn.equals("y")) {
                    run = true;
                    System.out.println("");
                } else if (yn.equals("N") || yn.equals("n")) {
                    run = false;
                } else {
                    System.out.print("Error. ");
                    validYN = false;
                }
            }
            
            validYN = false;
        }

        System.out.println("");
        System.out.println("Thanks for playing!");
        System.out.println("********************************");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties: " + ties);
    }
}