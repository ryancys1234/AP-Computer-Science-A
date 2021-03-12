class Question3 {
    public static void main(String[] args) {
        System.out.println(reverse("reverse"));
    }
    
    public static String reverse(String str) {
        if (str.length() < 2) return str;
        
        return reverse(str.substring(1)) + str.charAt(0);
    }
}