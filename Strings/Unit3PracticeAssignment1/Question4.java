class Question4 {
    public static void main(String[] args) {
        System.out.println(pigLatin("This is a test sentence"));
        System.out.println(pigLatin("This is question four of the assignment"));
    }
    
    public static String pigLatin(String str) {
        String ans = "";
        while (str.indexOf(" ") > 0) {
            String word = str.substring(0, str.indexOf(" "));
            
            if (word.length() > 2) {
                ans = ans + word.substring(1) + word.charAt(0) + "ay" + " ";
            } else ans = ans + word + " ";
            
            str = str.substring(str.indexOf(" ") + 1);
        }
        
        if (str.length() > 2) {
            ans = ans + str.substring(1) + str.charAt(0) + "ay" + " ";
        } else ans = ans + str + " ";
        
        return ans.substring(0, 1).toUpperCase() + ans.substring(1).toLowerCase();
    }
}