package OOPs;



class Thar_baseModel{
    Thar_baseModel(){ // overloading
        System.out.println("HIIIIIIII");
    }
    Thar_baseModel(int a){
        System.out.println("I AM HI " + a);
    }
    public  void  speed(int n ){ // overriding
      double speedd =  (n * 0.34);
        System.out.println("Speed is a : " + speedd);
    }

}

public class Thar_TopModel extends Thar_baseModel{


    public  void  speed(int n  ){
        double speedd =  (n * 0.10);
        System.out.println("Speed is a : " + speedd);
    }



    public static void main(String[] args) {
Thar_TopModel t = new Thar_TopModel();
        t.speed(89);
    }
}
