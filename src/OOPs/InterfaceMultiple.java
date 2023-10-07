package OOPs;

interface Thar_old {
    void tharSpeed();
    void tharTyreSize();
}

interface Thar_new {
    void tharSpeed();
    void milage();
}
class Thar_Top implements Thar_new, Thar_old {
    public void tharSpeed() {
        System.out.println("Max Speed : 170");
    }
    public void tharTyreSize() {
        System.out.println("Tyre size 10 inch");
    }
    public void milage() {
        System.out.println("Milage is 30 km /L");
    }
}

public class InterfaceMultiple {
    public static void main(String[] args) {
        Thar_Top top = new Thar_Top();
        top.milage();
        top.tharSpeed();
        top.tharTyreSize();
    }
}
