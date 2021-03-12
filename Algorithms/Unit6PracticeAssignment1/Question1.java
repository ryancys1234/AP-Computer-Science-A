class Question1 {
    public static void main(String[] args) {
        System.out.println(gcf(252, 105));
    }
    
    public static int gcf(int a, int b) {
        if (a == b) return a;
        
        if (a > b) return gcf(a - b, b);
        else return gcf(a, b - a);
    }
}