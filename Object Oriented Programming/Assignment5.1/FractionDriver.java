class FractionDriver {
    public static void main(String[] args) {
        Fraction myFraction = new Fraction();
        Fraction myFraction1 = new Fraction(1, 2);
        Fraction myFraction2 = new Fraction(1, 0);
        Fraction myFraction3 = new Fraction("1/2");
        Fraction myFraction4 = new Fraction("1/0");
        Fraction myFraction5 = new Fraction(myFraction1);
        Fraction myFraction6 = new Fraction(myFraction2);
        
        Fraction random1 = new Fraction(4, 16);
        
        System.out.println(myFraction);
        System.out.println(myFraction1 + ", " + myFraction2);
        System.out.println(myFraction3 + ", " + myFraction4);
        System.out.println(myFraction5 + ", " + myFraction6);
        System.out.println(myFraction2.getNum() + ", " + myFraction2.getDenom());
        System.out.println(Fraction.multiply(myFraction1, myFraction1));
        System.out.println(Fraction.divide(myFraction1, myFraction1));
        //System.out.println(myFraction.gcf(252, 105));
    }
}