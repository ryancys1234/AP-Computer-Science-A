class Question4 {
    public static void main(String[] args) {
        int[][] test = {{4, 6, 2, 5}, {7, 9, 4, 8}, {6, 9, 3, 7}};
        
        System.out.println("Hardest rater: #" + hardestRater2018(test));
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
}