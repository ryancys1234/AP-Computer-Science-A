class Question1 {
    public static void main(String[] args) {
        int[][] test = {{4, 6, 2, 5}, {7, 9, 4, 8}, {6, 9, 3, 7}};
        
        System.out.println("Movie 0's average rating: " + movieAvgRating(test, 0));
    }
    
    public static int movieAvgRating(int[][] ratings, int movie) {
        int sum = 0;
        
        for (int r = 0; r < ratings.length; r++) {
            sum += ratings[r][movie];
        }
        
        return (int) sum / ratings.length;
    }
}