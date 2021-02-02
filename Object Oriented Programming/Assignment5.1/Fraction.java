class Fraction {
    private int num, denom;
    
    // Constructors
    
    public Fraction() {
        num = 1;
        denom = 2;
    }
    
    public Fraction(int n, int d) {
        this.num = n;
        
        if (d == 0) {
            System.out.println("Error: the denominator is 0.");
            this.denom = 1;
        } else this.denom = d;
    }
    
    public Fraction(String f) {
        this.num = Integer.parseInt(f.substring(0, f.indexOf("/")));
        
        if (Integer.parseInt(f.substring(f.indexOf("/"), f.length() - 1)) == 0) {
            System.out.println("Error: the denominator is 0.");
            this.denom = 1;
        } else this.denom = Integer.parseInt(f.substring(f.indexOf("/"), f.length() - 1));
    }
    
    public Fraction(Fraction f) {
        this.num = f.num;
        if (f.denom == 0) {
            System.out.println("Error: the denominator is 0.");
            this.denom = 1;
        } else this.denom = f.denom;
    }
    
    // Accessor Methods
    
    public int getNum() {
        return this.num;
    }
    
    public int getDenom() {
        if (this.denom == 0) {
            System.out.println("Error: the denominator is 0.");
            this.denom = 1;
        }
        
        return this.denom;
    }
    
    public String toString() {
        if (this.denom == 0) {
            System.out.println("Error: the denominator is 0.");
            return this.num + " / " + 1;
        } else return this.num + " / " + this.denom;
    }
    
    // Mutator Methods
    
    public void setNum(int num) {
        this.num = num;
    }
    
    public void setDenom(int denom) {
        this.denom = denom;
    }
    
    // Static Methods
    
    // Helper Method
    
    public int gcf(int a, int b) {
        while (a != b) {
            int diff = Math.abs(b - a);
            b = diff;
        }
        
        return a;
    }
}