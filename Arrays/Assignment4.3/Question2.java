class Question2 {
    public static void main(String[] args) {
        int[][] test = {{4, 6, 2, 5}, {7, 9, 4, 8}, {6, 9, 3, 7}};
        
        System.out.println("Reviewer 0's average rating: " + reviewerAvgRating(test, 0));
    }
    
    public static int reviewerAvgRating(int[][] ratings, int reviewer) {
        int sum = 0;
        
        for (int c = 0; c < ratings[reviewer].length; c++) {
            sum += ratings[reviewer][c];
        }
        
        return (int) sum / ratings[reviewer].length;
    }
}