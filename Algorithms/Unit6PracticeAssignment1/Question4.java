class Question4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("palindrome"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("rotavator"));
    }
    
    public static boolean isPalindrome(String str) {
        if (str.length() < 2) return true;
        
        if (str.charAt(0) == str.charAt(str.length() - 1)) return isPalindrome(str.substring(1, str.length() - 1));
        else return false;
    }
}