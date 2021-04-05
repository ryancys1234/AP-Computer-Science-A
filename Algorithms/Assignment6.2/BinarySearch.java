public class BinarySearch {
    public static void main(String[] args) {
        int[] n = {0, 1, 2, 3, 4, 5, 7, 78, 89, 90};
        
        System.out.println(recursiveBinarySearch(n, 0, 7, 4));
        System.out.println(recursiveBinarySearch(n, 0, 10, 40));
        
        System.out.println(iterativeBinarySearch(n, 0, 10, 4));
        System.out.println(iterativeBinarySearch(n, 0, 10, 40));
    }
    
    public static int recursiveBinarySearch(int[] nums, int start, int end, int key) {
        if (start > end) return -1;
        
        int m = (start + end) / 2;
        
        if (nums[m] == key) return key;
        else if (nums[m] < key) return recursiveBinarySearch(nums, m + 1, end, key);
        else return recursiveBinarySearch(nums, start, m - 1, key);
    }
    
    public static int iterativeBinarySearch(int[] nums, int start, int end, int key) {
        while (start <= end) {
            int m = (start + end) / 2;
            
            if (nums[m] == key) return key;
            else if (nums[m] < key) start = m + 1;
            else if (nums[m] > key) end = m - 1;
        }
        
        return -1;
    }
}
