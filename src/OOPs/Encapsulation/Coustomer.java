package OOPs.Encapsulation;


import java.util.Scanner;

class customers {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Pass Key");
        String str = sc.nextLine();
        if (str.equals("ayushi")) {
            this.name = name;
            System.out.println("succesfully Setted ");
        } else System.out.println(" Password is wrong ");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Pass Key");
        String str = sc.nextLine();
        if (str.equals("ayushi")) {
            this.id = id;
            System.out.println("succesfully Setted ");
        } else System.out.println(" Password is wrong ");
    }
}


public class Coustomer {

    public static void main(String[] args) {
        customers c = new customers();
        c.setId(116);
        c.setName("Tanu jha");

        System.out.println(c.getId());
        System.out.println(c.getName());
    }
}
