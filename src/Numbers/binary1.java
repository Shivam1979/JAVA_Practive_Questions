package Numbers;


class IUC {
    void sum() {
        System.out.println("I AM sum");
    }

    class Prachi {
        void Diff() {
            System.out.println("I am diff");
        }
    }
}

public class binary1 {
    public static void main(String[] args) {
     IUC.Prachi obb = new IUC().new Prachi();
      //  System.err.println(obb);
        obb.Diff();


    }
}
