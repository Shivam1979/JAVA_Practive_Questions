package Pattern;

//🟢 119. 🎨 Can you print the following pattern using Java?
//      ******
//      *    *
//      *    *
//      ******
public class Pattern11 {

    public static void main(String[] args) {
        int r = 4;
        int c = 6;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <=c; j++) {
                if (i == 1 || i == r || j == 1 || j==c) {
                    System.out.print("*");
                }else System.out.print(" ");

            }
            System.out.println();

        }
    }
}
