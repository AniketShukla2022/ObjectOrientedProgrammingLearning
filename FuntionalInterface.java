import java.util.*;

@FunctionalInterface
interface Square {
    int findSquare();
}

class Number implements Square {
    int x;
    
    public Number(int x) {
        this.x = x;
    }
    
    public int findSquare() {
        return x*x;
    }
}

class Main{
    public static void main(String[] args) {
        Square sq = new Number(5);
        System.out.println("Square of the number is: " + sq.findSquare());
    }
}
