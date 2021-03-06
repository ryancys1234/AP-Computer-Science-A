import java.util.ArrayList;

class Question2 {
    public static void removeSmallest(ArrayList<Integer> nums) {
        int smallest = nums.get(0);
        
        if (nums.size() == 0) return;
        
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < smallest) smallest = nums.get(i);
        }
        
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) == smallest) nums.remove(i);
        }
    }
  
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
        }
        
        System.out.println("Our list before: " + nums);
        removeSmallest(nums);
        System.out.println("Our list after:  " + nums);
    }
}