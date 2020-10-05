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
        
        mark = (int) ((scored / total) * 100);
        System.out.println(" ");
        System.out.println("Your mark is " + mark + "%.");
        
        if (86 <= mark <= 100)
            System.out.println("Your mark is equivalent to an A");
    }
}
