package OOPs;

abstract class MusicPlayer{
    abstract void circuit();
    abstract void changeartist();
    abstract void Volume();
    void  frame(){
        int size = 9;
        String color = "red";
        System.out.println(size +" " +color);
    }
}
class Car extends MusicPlayer{
    @Override
    void circuit() {
    }
    @Override
    void changeartist() {
        System.out.println("Artist Changed");
    }
    @Override
    void Volume() {
    }
}
public class PartialAbstraction {
    public static void main(String[] args) {
        Car c = new Car();
        c.changeartist();
        c.circuit();
        c.Volume();
        c.frame();
    }
}
