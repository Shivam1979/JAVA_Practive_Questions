package Numbers;
abstract  class Circle{
    abstract  double areaCircle();
    int a ;
    Circle(int a ){
        this.a = a;
    }
}
public class Area extends Circle {
    Area(int a) {
       super(a);
    }
    @Override
    double areaCircle() {
        return Math.PI * super.a * super.a;
    }
    public static void main(String[] args) {
        Area ob = new Area(2);
        System.out.println(ob.areaCircle());
    }
}
