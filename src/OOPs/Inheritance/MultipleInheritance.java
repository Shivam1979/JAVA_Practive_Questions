package OOPs.Inheritance;
interface MaterialOfBottle {
    int material(int a);
}
interface StrengthOfBottle {
    int material(int a);
    int strength(int a);
}
public class MultipleInheritance implements MaterialOfBottle, StrengthOfBottle {
    @Override
    public int material(int a) {
        System.out.println("Shivam");
        return a;

    }
    @Override
    public int strength(int a) {
        System.out.println("Strength");
        return 0;
    }
}
class Main{
    public static void main(String[] args) {
        MultipleInheritance m = new MultipleInheritance();
        m.material(2);
        m.strength(12);
    }
}