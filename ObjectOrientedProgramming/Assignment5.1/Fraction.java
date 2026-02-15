class Fraction {
    private int num, denom;
    
    // Constructors
    
    public Fraction() {
        this.num = 1;
        this.denom = 2;
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
        return this.denom;
    }
    
    public String toString() {
        return this.num + " / " + this.denom;
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
        if (denom == 0) {
            System.out.println("Error: the denominator is 0.");
            this.denom = 1;
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
    
    public static Fraction add(Fraction a, Fraction b) {
        Fraction ans;
        
        if (a.denom == 0 || b.denom == 0) {
            System.out.println("Error: one or more denominator(s) is 0.");
            ans = new Fraction((a.num * b.denom) + (b.num * a.denom), 1);
        } else {
            ans = new Fraction((a.num * b.denom) + (b.num * a.denom), a.denom * b.denom);
            ans.reduce();
        }
        
        return ans;
    }
    
    public static Fraction subtract(Fraction a, Fraction b) {
        Fraction ans;
        
        if (a.denom == 0 || b.denom == 0) {
            System.out.println("Error: one or more denominator(s) is 0.");
            ans = new Fraction((a.num * b.denom) - (b.num * a.denom), 1);
        } else {
            ans = new Fraction((a.num * b.denom) - (b.num * a.denom), a.denom * b.denom);
            ans.reduce();
        }
        
        return ans;
    }
    
    public static Fraction multiply(Fraction a, Fraction b) {
        Fraction ans;
        
        if (a.denom == 0 || b.denom == 0) {
            System.out.println("Error: one or more denominator(s) is 0.");
            ans = new Fraction(a.num * b.num, 1);
        } else {
            ans = new Fraction(a.num * b.num, a.denom * b.denom);
            ans.reduce();
        }
        
        return ans;
    }
    
    public static Fraction divide(Fraction a, Fraction b) {
        Fraction ans;
        
        if (a.denom == 0 || b.denom == 0) {
            System.out.println("Error: one or more denominator(s) is 0.");
            return new Fraction(a.num * b.denom, 1);
        } else {
            ans = new Fraction(a.num * b.denom, a.denom * b.num);
            ans.reduce();
        }
        
        return ans;
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
