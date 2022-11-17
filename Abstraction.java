import java.util.*;


abstract class Shape {
    
    String color;
    abstract double area();
    public abstract String toString();
    
    Shape(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    
    double radius;
    
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * Math.pow(radius,2);
    }
    
    @Override
    public String toString() {
        return "Circle color is " + super.getColor() + " and area is : " + area();
    }
}

class Abstraction {
    public static void main(String[] args) {
        Circle circle = new Circle("Red",2.5);
        System.out.println(circle.toString());
    }
}
