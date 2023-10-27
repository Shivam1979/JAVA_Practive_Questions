package Pattern;

public class Pattern12 {
    /**
     * 203. **
     * <p>
     * 1
     * 22
     * 333
     * 4444
     * 55555
     * <p>
     * 4444
     * 333
     * 22
     * 1
     */
    public static void main(String[] args) {
        int r = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "");
            }
            System.out.println();
        }
        for (int i = r - 1; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(i + "");
            }
            System.out.println();
        }
    }
}
