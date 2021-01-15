import java.util.ArrayList;

class Question3 {
    public static ArrayList<Integer> add(ArrayList<Integer> n, ArrayList<Integer> m) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for (int i = 0; i < Math.max(n.size(), m.size()); i++) {
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
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(1);
        n.add(0);
        n.add(9);
        
        ArrayList<Integer> m = new ArrayList<Integer>();
        m.add(1);
        m.add(0);
        m.add(9);
        
        System.out.println(add(n, m));
    }
}