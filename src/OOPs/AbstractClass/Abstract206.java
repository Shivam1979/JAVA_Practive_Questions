package OOPs.AbstractClass;

abstract class Animal {
    abstract void eat();

    abstract void sleep();

    void cong() {
        System.out.println("i am base abstract class");
    }
}

class Lion extends Animal {

    @Override
    void eat() {
        System.out.println("I am lion  i am eating...");
    }

    @Override
    void sleep() {
        System.out.println("I am lion ,,, i am sleeping zzzzzzzzzzzzzzzzz");
    }

    public static void main(String[] args) {
        Lion l = new Lion();
        l.sleep();
        l.eat();
    }
}

