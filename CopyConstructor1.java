class Complex {
    int re, ig;
    public Complex(int re, int ig) {
        this.re = re;
        this.ig = ig;
    }
    
    public Complex(Complex c) {
        re = c.re;
        ig = c.ig;
    }
    
    @Override
    public String toString() {
        return ("Complex number is: "+re+"+i"+ig);
    }
}

class Main{
    public static void main(String[] args) {
        Complex c1 = new Complex(2,4);
        Complex c2 = new Complex(c1);
        System.out.println(c2.toString());
    }
}
