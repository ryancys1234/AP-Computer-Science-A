import java.util.ArrayList;

class Question2 {
    public static ArrayList<Integer> sieve(int n) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        for (int i = 2; i <= n; i++) {
            nums.add(i);
        }
        
        for (int i = 0; i < nums.size(); i++) {
            int var = nums.get(i);
            for (int j = nums.size() - 1; j >= 0; j--) {
                if (nums.get(j) % var == 0 && nums.get(j) != var) {
                    nums.remove(j);
                }
            }
        }
        
        return nums;
    }
    
    public static ArrayList<Integer> goldbach(ArrayList<Integer> nums, int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for (int i = 0; i < nums.size(); i++) {
            if (nums.contains(n - nums.get(i))) {
                ans.add(nums.get(i));
                ans.add(n - nums.get(i));
                break;
            }
        }
        
        return ans;
    }
    
    // Alternate method
    // public static void goldbach(int n) {
    //     ArrayList<Integer> nums = sieve(n);
    //    
    //     for (int i = 0; i < nums.size(); i++) {
    //         if (nums.contains(n - nums.get(i))) {
    //             System.out.print(nums.get(i) + " + " + (n - nums.get(i)));
    //             return;
    //         }
    //     }
    // }
    
    public static void main(String[] args) {
        System.out.println(sieve(20));
        System.out.println(goldbach(sieve(20), 20));
        // Alternate method
        // goldbach(20);
    }
}