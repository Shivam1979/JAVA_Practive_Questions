package OOPs;


class ParentClass {
    ParentClass(){
        System.out.println("I am DOG");
    }

}


class ChildClass extends ParentClass {
    ChildClass() {
        System.out.println("I AM CHILD");
    }
}

public class Main {
    public static void main(String[] args) {
        ChildClass a = new ChildClass();

    }
}