package OOPs.Polymorphism;

import java.util.concurrent.Callable;

/**
 * 189. *Polymorphism:* 🧮 Create an interface "Shape" with a method "calculateArea."
 * Implement this interface in classes like "Circle" and "Rectangle."
 * Calculate and display the area of these shapes. 🟢
 */

interface Shape {
    public abstract double calculateArea();
}

class Circle implements Shape {

    @Override
    public double calculateArea() {
        double radius = 4.599;
        double pi = Math.PI;
        double area = pi * Math.pow(radius, 2);
        return area;

    }
}

class Reactangle implements Shape {

    @Override
    public double calculateArea() {
        double area, length, breadth;
        length = 5.5;
        breadth = 6.5;
        double v = length + breadth;
        area = 2 * (length + breadth);
        return area;
    }
}

public class Polymorphism_189 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Reactangle r = new Reactangle();
        System.out.println("The Area of circle     : " + c.calculateArea());
        System.out.println("The Area of reactangle : " + r.calculateArea());
        r.calculateArea();

    }
};

