import java.util.Scanner;

class Triangle {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        int x = 0;

        System.out.print("Please enter a character. ");
        input = sc.next();

        System.out.print("Please indicate the height of the triangle. ");
        x = sc.nextInt();

        System.out.println("----------------------------------------------------------------");
        
        for (int n = 1; n <= x; n++) {
            for (int m = 1; m <= n; m++) {
                System.out.print(input);
            }
            System.out.println("");
        }
    }
}