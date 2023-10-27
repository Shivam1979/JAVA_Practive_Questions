/**
 * 207. *Composition:* 🧩 Create a class "Author" with attributes like name and books
 * written. Then create a class "Book" with attributes like title and author
 * (an instance of the "Author" class). Demonstrate how composition is used to represent
 * the relationship between books and authors. 📚📖
 */
package OOPs.Composition;

class Author {
    String name = "ShivamSingh";
    String books = "Java";
}
class Books extends Author {
  public String title = "Fundamental of java";
    public String author = "Shivam Singh";
    void run() {
        System.out.println("check method");
    }
}
public class Copmposition {


    public static void main(String[] args) {
        Books b = new Books();
        b.run();
        System.out.println(b.name);
        System.out.println(b.author);
        System.out.println(b.books);
        System.out.println(b.title);
    }
}
