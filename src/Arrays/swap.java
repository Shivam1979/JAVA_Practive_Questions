package Arrays;

class Main {
    public static void main(String args[]) {
        Scaler s = new Scaler(5);
    }
}
class Inter{
    Inter(){
        System.out.println(" Welcome to Inter ");
    }
}
class Scaler extends Inter{
    Scaler(){
        System.out.println(" Welcome 1 ");
    }
    Scaler(int x){
        super();
        System.out.println(" Welcome  2");
    }
}