package OOPs.Encapsulation;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;

/**
 * 320. Nested Classes: 🏠 Create a class "House" with a nested class "Kitchen."
 * Demonstrate how the nested class can access the attributes of the outer class.🍽
 */
class  House{
    private static String address;
    private static String style;

    public House(String address , String style){
        this.address = address;
        this.style = style;
    }
    static class Kitchen{
        private String[] appliances = {"Refrigerator", "Stove", "Dishwasher"};
        public Kitchen() {

        }
        public void describeKitchen() {
            System.out.println("The kitchen in the " + House.style + " house at " + House.address + " has the following appliances:");
            for (int i = 0; i <appliances.length ; i++) {
                System.out.print(appliances[i] +" ---");
            }
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        House hs = new House("Ankita Paarishar" ,"Modern");
        House.Kitchen k = new House.Kitchen();
        k.describeKitchen();
    }

    

}
