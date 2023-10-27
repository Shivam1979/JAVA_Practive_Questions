package OOPs.Inheritance;

/**
 * 188. *Inheritance:* 🚗 Create a base class "Vehicle" with attributes like make,
 * model, and year. Create a derived class "Car" that inherits from the base class
 * and adds specific attributes like fuel type and the number of doors. 🏎
 */
class Vehicle {
    String model = "M492";
    int year = 2008;
}
class Car extends Vehicle {
    String fuel_type = "Deisel";
    int door = 5;
}
public class Inheritance_188 {
    public static void main(String[] args) {
    Car  ob =  new Car();
        System.out.println("The model of Car : " +ob.model);
        System.out.println("Year of Manufacturing : "+ob.year);
        System.out.println("Type of Fuel :"+ob.fuel_type );
        System.out.println("Number of Doors :"+ob.door);
    }
}
