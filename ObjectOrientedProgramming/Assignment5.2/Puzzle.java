import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle {
    private String word;
    private String list;
    private ArrayList<String> words;
    
    public Puzzle() {
        words = new ArrayList<String>();

        try {
            File file = new File("Words.txt");
            Scanner scanner = new Scanner(file);
            String temp;

            while (scanner.hasNext()) {
                temp = scanner.next();
                if (Character.isLowerCase(temp.charAt(0))) words.add(scanner.next().toLowerCase());
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        word = words.get((int) (Math.random() * words.size()));
        list = "";
    }
    
    public void show() {
        System.out.println("Word: ");
        
        for (int i = 0; i < word.length(); i++) {
            if (list.contains(word.substring(i, i + 1))) System.out.print(word.charAt(i) + " ");
            else System.out.print("_ ");
        }
        
        System.out.println("");
        System.out.print("Guesses: ");
        
        for (int i = 0; i < list.length(); i++) {
            System.out.print(list.charAt(i));
            
            if (i < list.length() - 1) System.out.print(", ");
        }
    }
    
    public boolean isUnsolved() {
        for (int i = 0; i < word.length(); i++) {
            if (!list.contains(word.substring(i, i + 1))) return true;
        }
        
        return false;
    }
    
    public boolean makeGuess(String str) {
        str = str.toLowerCase();
        list += str;
        
        return word.contains(str);
    }
    
    public String getWord() {
        return word;
    }
}
