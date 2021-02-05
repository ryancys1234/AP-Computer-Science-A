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
        
        if (Integer.parseInt(f.substring(f.indexOf("/") + 1, f.length())) == 0) {
            System.out.println("Error: the denominator is 0.");
            this.denom = 1;
        } else this.denom = Integer.parseInt(f.substring(f.indexOf("/") + 1, f.length()));
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
    
    public Double toDouble() {
        double ans = this.num / this.denom;
        return ans;
    }
    
    // Mutator Methods
    
    public void setNum(int num) {
        this.num = num;
    }
    
    public void setDenom(int denom) {
        if (this.denom == 0) {
            System.out.println("Error: the denominator is 0.");
            this.num = 1;
        } else this.denom = denom;
    }
    
    public void reduce() {
        if (this.num != 0 && this.denom != 0) {
            int ans = gcf(this.num, this.denom);
            
            this.num = this.num / ans;
            this.denom = this.denom / ans;
        }
    }
    
    // Static Methods
    
    public static Fraction multiply(Fraction a, Fraction b) {
        Fraction f;
        
        if (a.denom == 0 || b.denom == 0) {
            f = new Fraction(a.getNum() * b.getNum(), 1);
            System.out.println("Error: a denominator is 0.");
        } else {
            f = new Fraction(a.getNum() * b.getNum(), a.getDenom() * b.getDenom());
            f.reduce();
        }
        
        return f;
    }
    
    public static Fraction divide(Fraction a, Fraction b) {
        Fraction f;
        
        if (a.denom == 0 || b.denom == 0) {
            f = new Fraction(a.getNum() * b.getDenom(), 1);
            System.out.println("Error: a denominator is 0.");
        } else {
            f = new Fraction(a.getNum() * b.getDenom(), a.getDenom() * b.getNum());
            f.reduce();
        }
        
        return f;
    }
    
    // Helper Method
    
    private int gcf(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        
        while (a != b) {
            int diff = Math.abs(b - a);
            
            if (a > b) a = diff;
            else b = diff;
        }
        
        return a;
    }
}