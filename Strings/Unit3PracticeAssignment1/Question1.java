class Question1 {
    public static void main(String[] args) {
        System.out.println(song("I have a function, I have a string"));
        System.out.println(song("I have a class, I have a AP"));
    }
    
    public static String song(String str) {
        String word1 = str.substring(9, str.indexOf(","));
        String word2 = str.substring(str.indexOf(",") + 11, str.length());
        return "Uh! " + word2.substring(0, 1).toUpperCase() + word2.substring(1, word2.length()) + " " + word1;
    }
}