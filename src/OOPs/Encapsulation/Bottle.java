package OOPs.Encapsulation;

public class Bottle {
    double length;
    String color;
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
class Main extends Bottle {
    public static void main(String[] args) {
        Bottle b = new Bottle();
        b.setColor("red");
        System.out.println(b.getColor());
        b.setColor("Green");
        System.out.println(b.getColor());
        b.setLength(45.2);
        System.out.println(b.getLength());

    }
}
