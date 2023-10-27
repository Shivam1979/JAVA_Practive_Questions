package OOPs.Interface;

/**
 * 205. *Interface:* 📝 Create an interface "Drawable" with a method "draw."
 * Implement this interface in classes like "Circle," "Rectangle," and "Triangle."
 * Demonstrate how each class implements the "draw" method differently. 🎨🟡🟥🔺
 */

interface Drawable {
    void draw();
}

class Cicle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Draw like a circle ........");
    }
}
class Reactangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Draw  2 parallel line and  draw 2 more line 90 degree and connect aecb of them");
    }
}
class Triangle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Dram a strainght line and end of the line draw a two  line and  connect both of the end ");
    }
}

public class Interface205  {

}
