package OOPs.Object;

/**
 *
 217. *Static vs. Instance Variables and Methods:* 🌐 Create a class "Website" with a static
 variable "websiteCount" to keep track of the number of websites created and an instance variable
 \"name" to store the website's name. Implement static and instance methods to access and
 manipulate these variables.
 */
class Websites{
    static int websiteCount =0;
    String name ;
    public void wensite(String name){
        System.out.println("Loading ...."+name);
        websiteCount++;
        this.name = name;
    }
}
public class Object217 {
    public static void main(String[] args) {
        Websites w = new Websites();
        w.wensite("google");
        w.wensite("Wickipedia");
        w.wensite("Duolingo");
        System.out.println("Number of Time Website call :"+Websites.websiteCount);
    }
}
