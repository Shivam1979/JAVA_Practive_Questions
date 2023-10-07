package Numbers;

import java.util.Scanner;

public class Numberofborrow {
    static int subtract(int x, int y)
        {

            int count = 0;
            while (y != 0)
            {
                count++;
                int borrow = (~x) & y;
                x = x ^ y;
                y = borrow << 1;

            }
            return count;
        }

        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("Number of count is " +
                    subtract(x, y));
        }
    }


