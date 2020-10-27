class Question2 {
    public static void main(String[] args) {
        int x = 0, y = 0, z = 1, i = 1, sum = 0;

        while (x <= 4000000 && y <= 4000000 && z <= 4000000) {
            if (x <= 4000000) {
                x = y + z;
                System.out.print(x + ", ");

                if (x % 2 == 0) sum+= x;

                if (y <= 4000000) {
                    y = z + x;
                    System.out.print(y + ", ");

                    if (y % 2 == 0) sum+= y;

                    if (z <= 4000000) {
                        z = x + y;
                        System.out.print(z + ", ");

                        if (z % 2 == 0) sum+= z;
                    }
                }
            }
        }
        
        System.out.println("end of sequence.");
        System.out.println("Sum: " + sum);
    }
}