import java.util.Scanner;

class GradeBot {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double scored = 0;
        double total = 0;
        int mark = 0;

        System.out.println("The GradeBot:");
        System.out.println("What mark did you receive?");
        scored = sc.nextDouble();

        System.out.println(" ");
        System.out.println("What was the test out of?");
        total = sc.nextDouble();

        if (total == 0) {
            System.out.println(" ");
            System.out.println("Please enter a non-zero value.");
        } else {
            mark = (int) ((scored / total) * 100);
            System.out.println(" ");
            System.out.println("Your mark is " + mark + "%.");
            System.out.println(" ");

            if (mark >= 86 && mark <= 100)
                System.out.println("Your mark is equivalent to an A. Well done.");
            else if (mark >= 73 && mark <= 85)
                System.out.println("Your mark is equivalent to a B. Well done.");
            else if (mark >= 67 && mark <= 72)
                System.out.println("Your mark is equivalent to a C+. Well done.");
            else if (mark >= 60 && mark <= 66)
                System.out.println("Your mark is equivalent to a C. Keep trying.");
            else if (mark >= 50 && mark <= 59)
                System.out.println("Your mark is equivalent to a C-. Keep trying.");
            else if (mark >= 0 && mark <= 49)
                System.out.println("Your mark is equivalent to an F. Keep trying.");
            else if (mark >= 100)
                System.out.println("Your mark is greater than 100%. Please try again.");
            else if (mark <= 0)
                System.out.println("Your mark is negative. Please try again.");
            else
                System.out.println("Error. Please try again.");
        }
    }
}