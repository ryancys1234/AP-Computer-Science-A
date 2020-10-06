import java.util.Scanner;

class Magic8Ball {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = 0;

        System.out.println("Magic Eight Ball.");
        System.out.println("Please ask a yes-or-no question.");
        sc.nextLine();

        random = (int) (Math.random() * 20 + 1);
        System.out.println(" ");

        if (random == 1)
            System.out.println("It is certain.");
        else if (random == 2)
            System.out.println("It is decidedly so");
        else if (random == 3)
            System.out.println("Without a doubt.");
        else if (random == 4)
            System.out.println("Yes - definitely.");
        else if (random == 5)
            System.out.println("You may rely on it.");
        else if (random == 6)
            System.out.println("As I see it, yes.");
        else if (random == 7)
            System.out.println("Most likely.");
        else if (random == 8)
            System.out.println("Outlook good.");
        else if (random == 9)
            System.out.println("Yes.");
        else if (random == 10)
            System.out.println("Signs point to yes.");
        else if (random == 11)
            System.out.println("Reply hazy, try again.");
        else if (random == 12)
            System.out.println("Ask again later.");
        else if (random == 13)
            System.out.println("Better not tell you now.");
        else if (random == 14)
            System.out.println("Cannot predict now.");
        else if (random == 15)
            System.out.println("Concentrate and ask again.");
        else if (random == 16)
            System.out.println("Don't count on it.");
        else if (random == 17)
            System.out.println("My reply is no.");
        else if (random == 18)
            System.out.println("My sources say no.");
        else if (random == 19)
            System.out.println("Outlook not so good.");
        else if (random == 20)
            System.out.println("Very doubtful.");
    }
}