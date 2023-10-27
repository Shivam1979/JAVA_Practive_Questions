package OOPs.Encapsulation;

class Employe {
    private int account;
    private String name = "shivam";
    public int getAccount() {
        return account;
    }
    public void setAccount(int account) {
        this.account = account;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        Employe ob = new Employe();
        ob.setAccount(568945);
        ob.setName("prince");
        System.out.println(ob.getName());
        System.out.println(ob.getAccount());
    }
}
