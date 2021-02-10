class FractionDriver {
    public static void main(String[] args) {
        Fraction test1 = new Fraction();
        Fraction test2 = new Fraction(1, 2);
        Fraction test3 = new Fraction("1/2");
        Fraction test4 = new Fraction(test1);
        
        System.out.println(test1); // Automatically calls toString().
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        
        Fraction test5 = new Fraction(15, 17);
        Fraction test6 = new Fraction(25, 35);
        Fraction test7 = new Fraction("20, 0"); // Can't call Fraction(20, 0) as the relevant constructor converts the 0 to 1.
        Fraction test8 = new Fraction(-1, 9);
        
        System.out.println(Fraction.add(test5, test8));
        System.out.println(Fraction.subtract(test5, test8));
        System.out.println(Fraction.multiply(test5, test6));
        System.out.println(Fraction.divide(test5, test6));
        System.out.println(Fraction.divide(test6, test7));
        
        //System.out.println(myFraction.gcf(252, 105));
    }
}