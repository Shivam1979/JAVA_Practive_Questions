package OOPs.Abstraction;

/***
 *
 191. *Abstraction:* 🎨 Create an abstract class "Shape" with abstract methods like
 "calculateArea"and "calculatePerimeter." Implement this class in concrete classes
 like "Circle" and "Rectangle." ✒

 */
abstract class Shape {
    abstract long calculateArea();

    abstract long calculatePerimeter();
}

class Circle extends Shape {
    @Override
    long calculateArea() {
        double radius = 4.599;
        double pi = Math.PI;
        double area = pi * Math.pow(radius, 2);
        return (long) area;
    }

    @Override
    long calculatePerimeter() {
        double radius = 4.599;
        double pi = Math.PI;
        return (long) (2 * pi * radius);
    }
}

class Reactangle extends Shape {
    @Override
    long calculateArea() {
        double area, length, breadth;
        length = 5.5;
        breadth = 6.5;
        double v = length + breadth;
        area = 2 * (length + breadth);
        return (long) area;
    }
    @Override
    long calculatePerimeter() {
        double perimeter, length, breadth;
        length = 5.5;
        breadth = 6.5;
        perimeter = length * breadth;
        return (long) perimeter;
    }
}
public class Abstraction_191 {
    public static void main(String[] args) {
        Reactangle r = new Reactangle();
        Circle c = new Circle();
        System.out.println("Area of Reactangle : " + r.calculateArea());
        System.out.println("Perimeter of Reactangle : " + r.calculatePerimeter());
        System.out.println("Area of Circle : " + c.calculateArea());
        System.out.println("Perimeter of Circle : " + c.calculatePerimeter());
    }
}
