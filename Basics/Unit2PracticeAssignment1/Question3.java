class Question3 {
    public static void main(String[] args) {
       int sumOfSquares = 0, squareOfSum = 0, sum = 0;
       
       for (int x = 0; x <= 100; x++) {
           sumOfSquares += (int) Math.pow(x, 2);
       }
       
       for (int y = 0; y <= 100; y++) {
           sum += y;
           squareOfSum = (int) Math.pow(sum, 2);
       }
       
       System.out.println(squareOfSum - sumOfSquares);
    }
}