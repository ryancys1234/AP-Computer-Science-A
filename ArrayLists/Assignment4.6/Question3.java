import java.util.ArrayList;

class Question3 {
    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int numA = a.size() - 1, numB = b.size() - 1, var = 0;
        
        while (numA >= 0 || numB >= 0) {
            int sum = 0;
            
            if (numA >= 0 && numB >= 0) sum = a.get(numA) + b.get(numB) + var;
            else {
                if (numA >= 0) sum = a.get(numA) + var;
                if (numB >= 0) sum = b.get(numB) + var;
            }
            
            if (sum >= 10) {
                sum -= 10;
                var = 1;
            } else var = 0;
            
            ans.add(0, sum);
            
            numA--;
            numB--;
        }
        
        if (var == 1) ans.add(0, 1);
        
        return ans;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        ArrayList<Integer> listB = new ArrayList<Integer>();
        ArrayList<Integer> listC = new ArrayList<Integer>();
        ArrayList<Integer> listD = new ArrayList<Integer>();
        
        listA.add(1);
        listA.add(0);
        listA.add(9);
        listB.add(1);
        listB.add(0);
        listB.add(9);
        listB.add(5);
        listC.add(9);
        listC.add(9);
        listC.add(9);
        listC.add(9);
        listD.add(9);
        listD.add(9);
        listD.add(9);
        listD.add(9);
        
        System.out.println(add(listA, listB));
        System.out.println(add(listC, listD));
    }
}