package Numbers;

public class IncreDecre {
    int a = 9;
    int b = 2;
    static  int r = 89;

    IncreDecre() {
        b = 10;
        System.out.println("I 1st CONSTRUCTOR ");
    }
    IncreDecre(String s) {
        b = 10;
        System.out.println("I 2nd CONSTRUCTOR ");
    }
    public static void sub() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    //static block
    static {
        System.out.println("I AM STATIC BLOCK");
    }

    public static void main(String[] args) {
      
        System.out.println("MAIN");
        System.out.println(r);
        IncreDecre objr = new IncreDecre("hi");
        sub();
        System.out.println(r);

    }
}
