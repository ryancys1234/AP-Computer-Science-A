import java.util.Scanner;

class Password {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine(); //Reads next string

        if (password.equals("Password"))
            System.out.println("Password accepted.");
        else
            System.out.println("Password not accepted. Please try again.");
    }
}
