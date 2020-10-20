class Question2 {
    public static void main(String[] args) {
        int x = 1, y = 1, z = 0, sum = 0;
        while (z <= 4000000) {
            z = x + y;
            y = x;
            z = y;
        }
        System.out.println(x + " " + y + " " + z);
    }
}