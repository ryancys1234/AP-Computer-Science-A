class Question2 {
    public static void main(String[] args) {
        System.out.println(triangle(5));
    }
    
    public static String triangle(int a) {
        if (a == 0) return "";
        
        printStars(a);
        
        return triangle(a - 1);
    }
    
    public static String reverseTriangle(int a) {
        if (a == 0) return "";
        
        printStars(a);
        
        return triangle(a + 1);
    }
    
    public static void printStars(int n) {
        for (int i = 0; i < n; i++) System.out.print("*");
        
        System.out.println("");
    }
}