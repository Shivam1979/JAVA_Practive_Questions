package OOPs;

/**

 187.*Create a Class and Object:* 🎓 Define a class "Student" with attributes
 like name, roll number, and age. Create objects of the class and
 display their details. 📚
 */
class Student {
    String name = "Shivam";
    int roll_no = 101;
    int age = 21;
}


public class OPPS_187 {

    public static void main(String[] args) {
        Student ob = new Student();
        System.out.println("The name of student is : " + ob.name);
        System.out.println("The roll_number of student is : " + ob.roll_no);
        System.out.println("The age of student is : " + ob.age);

    }
}
