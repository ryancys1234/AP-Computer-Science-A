class Question1 {
    public static void main(String[] args) {
        int[][] test = {{4, 6, 2, 5}, {7, 9, 4, 8}, {6, 9, 3, 7}};
        
        System.out.println("Movie 0's average rating: " + movieAvgRating(test, 0));
        System.out.println("Reviewer 0's average rating: " + reviewerAvgRating(test, 0));
        System.out.println("Average rating of all movies: " + avgRating2018(test));
        System.out.println("Hardest rater: #" + hardestRater2018(test));
        System.out.println("Worst movie: #" + worstMovie2018(test));
    }
    
    public static int movieAvgRating(int[][] ratings, int movie) {
        int sum = 0;
        
        for (int r = 0; r < ratings.length; r++) {
            sum += ratings[r][movie];
        }
        
        return (int) sum / ratings.length;
    }
    
    public static int reviewerAvgRating(int[][] ratings, int reviewer) {
        int sum = 0;
        
        for (int c = 0; c < ratings[reviewer].length; c++) {
            sum += ratings[reviewer][c];
        }
        
        return (int) sum / ratings[reviewer].length;
    }
    
    public static int avgRating2018(int[][] ratings) {
        int sum = 0;
        
        for (int r = 0; r < ratings.length; r++) {
            for (int c = 0; c < ratings[r].length; c++) {
                sum += ratings[r][c];
            }
        }
        
        return (int) sum / (ratings.length * ratings[0].length);
    }
    
    public static int hardestRater2018(int[][] ratings) {
        int lowestAvg = 5, worst = 0;
        
        for (int r = 0; r < ratings.length; r++) {
            int sum = 0;
            
            for (int c = 0; c < ratings[r].length; c++) {
                sum += ratings[r][c];
            }
            
            if (sum / ratings[0].length < lowestAvg) worst = r;
        }
        
        return worst;
    }
    
    public static int worstMovie2018(int[][] ratings) {
        int lowestAvg = 5, worst = 0;
        
        for (int c = 0; c < ratings[0].length; c++) {
            int sum = 0;
            
            for (int r = 0; r < ratings.length; r++) {
                sum += ratings[r][c];
            }
            
            if (sum / ratings.length < lowestAvg) worst = c;
        }
        
        return worst;
    }
}
