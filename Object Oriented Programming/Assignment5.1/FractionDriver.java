class FractionDriver {
    public static void main(String[] args) {
        Fraction myFraction = new Fraction();
        Fraction myFraction1 = new Fraction(1, 2);
        Fraction myFraction2 = new Fraction(1, 0);
        
        System.out.println(myFraction.gcf(252, 105));
    }
}