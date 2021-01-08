import java.util.ArrayList;

class Question2 {
    public static ArrayList<Integer> sieve(int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int var = 2;
        
        for (int i = 2; i <= n; i++) {
            ans.add(i);
        }
        
        while (var <= n) {
            for (int j = ans.size() - 1; j >= 0; j--) {
                if (ans.get(j) % var == 0 && ans.get(j) != var) {
                    ans.remove(j);
                }
            }
            
            var++;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(sieve(200));
    }
}