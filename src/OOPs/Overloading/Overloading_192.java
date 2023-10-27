package OOPs.Overloading;

/**
 * 192. *Constructor Overloading:* 🏗 Create a class "Book" with attributes like title,
 * author, and publication year. Implement multiple constructors to initialize these
 * attributes in different ways. 📖
 */
class Books {
    String title;
    String auther;
    int yearOfPublication;

    Books(String auther) {
        this.auther = auther;
    }
    Books(String auther, int yearOfPublication) {
        this.auther = auther;
        this.yearOfPublication = yearOfPublication;
    }
    Books(String title, String auther, int yearOfPublication) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.auther = auther;
    }
}

public class Overloading_192 {
    public static void main(String[] args) {
    Books b = new Books("Harper Lee");
        System.out.println(b.auther +"-"+b.title+"-"+b.yearOfPublication);
    Books c = new Books("Harper Lee",1960);
        System.out.println(c.auther +"-"+c.title+"-"+c.yearOfPublication);
    Books d = new Books("Harper Lee","To Kill a Mockingbird",1960 );
        System.out.println(d.auther +"-"+d.title+"-"+d.yearOfPublication);
    }
}
