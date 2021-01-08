import java.util.ArrayList;

class Question4 {
    public static void filter(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        for (int i = 0; i < nums1.size(); i++) {
            if (nums2.contains(nums1.get(i))) nums1.remove(i);
        }
    }
    
    public static void main (String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(4);
        nums2.add(2);
        nums2.add(4);
        
        System.out.println("The list before: " + nums1);
        filter(nums1, nums2);
        System.out.println("The list after:  " + nums1);
    }
}