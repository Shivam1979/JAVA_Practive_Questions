package OOPs.Inheritance;
class  Bottle {
    String color;
    void sizeBottle(float a ){
        System.out.println("the size of bottle is  : "+ a);
    }
}
class  WaterBottle extends Bottle{
    double sizeOfCap;
    String color ;
    WaterBottle(String a , String b){
        this.color = a;
        super.color = b;
    }
    void  capColor(String a){
        System.out.println("The color of cap Bottle is : "+ a);
        System.out.println("The color of parent bottle is "+super.color);
        System.out.println("The color of child bootle is  "+this.color);
        System.out.println(this.sizeOfCap);
}}
public class BottleClass {
    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle("Red" , "White");
        wb.sizeBottle(34.3f);
        wb.capColor("Yellow");


}}
