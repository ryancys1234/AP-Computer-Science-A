class Question3 {
    public static void main(String[] args) {
        int[][] test = {{4, 6, 2, 5}, {7, 9, 4, 8}, {6, 9, 3, 7}};
        
        System.out.println("Average rating of all movies: " + avgRating2018(test));
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
}