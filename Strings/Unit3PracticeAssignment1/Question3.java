class Question3 {
    public static void main(String[] args) {
        System.out.println(binary(11));
        System.out.println(binary(1011));
    }
    
    public static String binary(int n) {
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