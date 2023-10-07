package Pattern;

/**
 * *141. Write a program to print the rectangle alphabet pattern.* 🅰🅱🇨
 * A B C D E
 * A B C D E
 * A B C D E
 * A B C D E
 * A B C D E
 */
public class Abcde {
    public static void main(String[] args) {
        int r = 5;
        int c = 5;
        for (int i = 1; i <= 5  ; i++) {
            char ch = 'A';
            for (int j = 1; j <= c; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
