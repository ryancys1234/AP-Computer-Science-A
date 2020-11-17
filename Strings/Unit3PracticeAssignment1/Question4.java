class Question4 {
    public static void main(String[] args) {
        System.out.println(pigLatin("I think starcraft is good"));
    }
    
    public static String pigLatin(String str) {
        String ans = "";
        while (str.indexOf(" ") > 0) {
            String word = str.substring(0, str.indexOf(" "));
            
            if (str.length() > 2) {
                ans = word.substring(1, word.length()) + word.charAt(0) + "ay";
            } else ans += word;
            
            str = str.substring(str.indexOf(" "));
        }
        
        
        return ans;
    }
}
