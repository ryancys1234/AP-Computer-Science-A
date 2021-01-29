class Fraction {
    private int num, denom;
    
    public Fraction() {
        num = 1;
        denom = 2;
    }
    
    public Fraction(int n, int d) {
        this.num = n;
        
        if (d == 0) {
            System.out.println("Error: the denominator is 0");
            this.denom = 1;
        } else this.denom = d;
    }
    
    public Fraction(String f) {
        this.num = Integer.parseInt(f.substring(0, f.indexOf("/")));
        
        if (Integer.parseInt(f.substring(f.indexOf("/"), f.length() - 1)) == 0) {
            System.out.println("Error: the denominator is 0");
            this.denom = 1;
        } else this.denom = Integer.parseInt(f.substring(f.indexOf("/"), f.length() - 1));
    }
    
    public Fraction(Fraction f) {
        this.num = f.num;
        this.denom = f.denom;
    }
    
    public int getNum() {
        return this.num;
    }
    
    public int getDenom() {
        return this.denom;
    }
}