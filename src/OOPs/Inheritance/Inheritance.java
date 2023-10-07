package OOPs.Inheritance;


class A {
    void sum(int a, int b) {
        System.out.println("int a , int b");

    }
}
class B  extends A{
     void sum(int a, int b ) {
        System.out.println("int a , int b");

    }
}
class Polymorphism {
    public static void main(String[] args) {
        A a = new A();
    }
}