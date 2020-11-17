class Question2 {
    public static void main(String[] args) {
        System.out.println(palindrome("Racecar"));
        System.out.println(palindrome("Taco cat"));
        System.out.println(palindrome("Not a palindrome"));
    }
    
    public static boolean palindrome(String str) {
        String ans = "";
        boolean var = true;
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) ans += str.substring(i, i + 1).toLowerCase();
        }
        
        for (int j = 0; j <= (int) ans.length() / 2 + 1; j++) {
            if (ans.charAt(j) != (ans.charAt(ans.length() - 1 - j))) var = false;
        }
        
        return var;
    }
}