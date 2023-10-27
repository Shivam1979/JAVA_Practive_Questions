package OOPs.Overriding;

/**
 *216. *Method Overriding with Superclass Methods:* 🔄 Create a class "Shape" with a method
 * "display," and then create subclasses like "Circle," "Rectangle," and "Triangle" that override
 * the "display" method to provide their specific shapes. Demonstrate how to call the superclass
 * method from the subclass. 🌕🟡🟥🔺
 */

class Shape{
    int a = 20;
    public  void display(){
        System.out.println("Every shape have a shape and it will display..");
    }
}
class Triangle extends Shape
{
    int a = 10;
    @Override
    public void display(){
        super.display();
        System.out.println(super.a);
        System.out.println("Triangle shape ");
    }
}
public class MethodOverriding_216{
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.display();
    }
}
