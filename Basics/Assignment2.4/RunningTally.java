import java.util.Scanner;

class RunningTally {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int integer = 0, sum = 0;
        
        System.out.println("Type some positive integers. To find their sum, type a negative integer.");
        System.out.println("Note that the sum will be updated if you type new positive integer(s) after the negative integer.");

        while (integer >= 0) {
            integer = sc.nextInt();

            if (integer >= 0) {
                System.out.println("Add: " + integer);

                sum = sum + integer;
            }
        }
        System.out.println("The sum is " + sum);
    }
}