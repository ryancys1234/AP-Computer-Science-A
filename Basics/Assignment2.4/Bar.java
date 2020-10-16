import java.util.Scanner;

class Bar {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = ""; // String initialized to empty
        int x = 0;
        
        System.out.print("Please enter a character. ");
        input = sc.next();
        
        System.out.print("Please indicate the number of characters to be displayed. ");
        x = sc.nextInt();
        
        System.out.println("----------------------------------------------------------------");
        
        for (int n = 1; n <= x; n++) {
            System.out.print(input);
        }
    }
}