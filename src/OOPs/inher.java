package OOPs;

interface speed {
    void speed();
}

interface engine {
    void stroke();
}

class Multi_Inheri_Car implements speed, engine {

    @Override
    public void speed() {
        System.out.println("  Max speed is 340 ");
    }


    @Override
    public void stroke() {
        System.out.println(" Number of stroke 4 ");
    }
}

public class inher {

    public static void main(String[] args) {

        Multi_Inheri_Car mr = new Multi_Inheri_Car();

        mr.speed();

        mr.stroke();


    }

}
