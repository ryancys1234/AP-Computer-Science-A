import java.util.ArrayList;

class Question1 {
    public static ArrayList<Integer> sieve(int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for (int i = 2; i <= n; i++) {
            ans.add(i);
        }
        
        for (int i = 0; i < ans.size(); i++) {
            int var = ans.get(i);
            for (int j = ans.size() - 1; j >= 0; j--) {
                if (ans.get(j) % var == 0 && ans.get(j) != var) {
                    ans.remove(j);
                }
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(sieve(200));
    }
}