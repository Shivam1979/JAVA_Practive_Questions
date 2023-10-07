package OOPs.Polymorphism;

class Bottle {
    String color;


     void capacity(double r) {
        double pi = Math.PI;
        r = r - 1;
        System.out.println("Unit Capacity : " + pi * r * r);
    }

    protected void unitcapacity(double r) {
        double pi = Math.PI;
        System.out.println("Unit Capacity : " + pi * r * r);
    }

    void unitcapacity(double r, double h) {
        double pi = Math.PI;
        System.out.println("Capacity of bottle  : " + pi * r * r * h);
    }
}
class SmallBottle extends Bottle {


    @Override
    protected void unitcapacity(double r) {

    }

    void capacity(double r) {
        double pi = Math.PI;
        r = r - 2;
        System.out.println("Unit Capacity : " + pi * r * r);
    }
}

public class Main {
    public static void main(String[] args) {
        SmallBottle s = new SmallBottle();
        s.capacity(45);
      s.unitcapacity(20.3);
      s.unitcapacity(5.2,5.6);
    }
}
