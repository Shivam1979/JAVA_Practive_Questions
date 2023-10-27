package OOPs.Encapsulation;

/**
 * 214. *Encapsulation and Getter/Setter Methods:* 🧳 Create a class "Employee" with private
 * attributes like salary and designation. Provide getter and setter methods to access and modify
 * these attributes. Explain the concept of encapsulation. 💼
 */

// Encapsulation : Encapsulation is the process in which we can bind our data member and member
// function in single unit ,  but provide bydefault incapsulation because by default it have
// class but if we want 100% then we use access modifier
class Employee {
    private int salary = 220;
    private String designation;

    public int getSalary(){
        return salary;
    }
    public void setSalary(int a){
        this.salary= a;
    }
    public String getdesignation(){
        return designation;
    }
    public void setdesignation(String a){
        this.designation = a;
    }
}
public class Encapsulation214 {
    public static void main(String[] args) {
    Employee e = new Employee();
    e.setdesignation("IT");
    e.setSalary(56000);
        System.out.println("Designations : "+e.getdesignation());
        System.out.println("Salary       : "+e.getSalary());
    }

}
