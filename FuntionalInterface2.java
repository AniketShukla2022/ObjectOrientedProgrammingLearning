import java.util.*;

@FunctionalInterface
interface Square {
    int findSquare(int x);
}

class Main{
    public static void main(String[] args) {
        Square sq = new Square() {
            public int findSquare(int x) {
                return x*x;
            }
        };
        System.out.println("Square of the number is: " + sq.findSquare(5));
    }
}
