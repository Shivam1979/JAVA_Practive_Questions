package OOPs;

/**
 * 208. *Aggregation:* 📚 Design a class structure for a library management system. Create classes for
 * "Library," "Book," and "Member." Use aggregation to show how books are stored in the library and how
 * members are associated with the library. 📚🏢👥
 */

class Library {
    String location = "Bhopal";
    String books = "DBMS";
    String name = "Basics of DBMS";}
class Book extends Library {
    int ISBN = 5656445;
    String author = "KP Tripathi";
    String title = "DBMS series";
}
class Member extends Book {
    int member_id = 101;
    String name = "Shivam Singh";
    int books_Borrowed = 2;
}
public class libraryManagementSystem {
    public static void main(String[] args) {
        Member m = new Member();
        System.out.println(m.author);
        System.out.println(m.books_Borrowed);
        System.out.println(m.books);
        System.out.println(m.ISBN);
        System.out.println(m.location);
    }
}
