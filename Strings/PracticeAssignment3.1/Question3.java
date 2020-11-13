class Question3 {
    public static void main(String[] args) {
        System.out.println(bin(11));
    }
    
    public static String bin(int n) {
        String ans = "";
        int remainder = 0;
        while (n > 0) {
            remainder = n % 2;
            ans = remainder + ans;
            n = n / 2;
        }
        
        return ans;
    }
}