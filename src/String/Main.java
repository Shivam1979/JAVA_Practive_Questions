package String;


class Parent {


 /*   public  static void sum(int a){
        System.out.println("SSShhh");
    }*/

        public  static void sum(int a){
        System.out.println("SSShhh");
    }
}

class Child extends Parent {
        public  static  void sum(int a){
        System.out.println("SSShhh");
        }
}


public class Main {
    public static void main(String[] args) {
        Parent c = new Child();

    }

    ;
}