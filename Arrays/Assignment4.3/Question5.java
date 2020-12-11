class Question5 {
    public static void main(String[] args) {
        int[][] test = {{4, 6, 2, 5}, {7, 9, 4, 8}, {6, 9, 3, 7}};
        
        System.out.println("Worst movie: #" + worstMovie2018(test));
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