class Complex {
    double real;
    double img;
    
    Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }
    
    Complex(Complex c) {
        System.out.println("copy constructor called");
        real = c.real;
        img = c.img;
    }
    
    @Override 
    public String toString() {
        return "(" + real + " + " + img + "i)";
    }
}

class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(10.3,5.7);
        Complex c2 = new Complex(c1);
        c2.toString();
    }
}
