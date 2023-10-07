package Pattern;


public class Logic {
    static void pattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 4 && j == 2) {
                    System.out.print("  ");
                } else System.out.print("* ");
                // System.out.print("(" +i+" "+j+") ");
            }
            System.out.println();

        }
    }


    static void pattern2() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if ((i == 2 || i == 3) && (j == 2 || j == 3)) {
                    System.out.print("  ");
                } else System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern3() {
        /*
         * * * *
         * * *
         * *
         *
         */

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i + 1; j++) {
                System.out.print("* ");
            }
            //  m++;
            System.out.println();
        }
    }


    static void pattern4() {
        for (int k = 1; k <= 4; k++) {
            for (int i = 1; i <= i; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern5() {

        for (int i = 1; i <= 4; i++) {
            char ch = 'A';
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();

        }
    }

    static void pattern6() {
        /*\

         * * * * *
         *       *
         *       *
         * * * * *

         */

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == 2 || i == 3) && ((j == 2 || j == 3 || j == 4))) {
                    //if (( i>=2 && i <=3) && (j>=2 && j<=4)){
                    System.out.print("  ");
                } else System.out.print("* ");

            }
            System.out.println();

        }
    }

    static void pattern7() {
        /*

         *
         * *
         * * *
         * * * *

         */

        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8() {
        /*

         *
         * *
         * * *
         * * * *

         */

        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j <= n) {
                    System.out.print("  ");
                } else System.out.print("* ");

            }
            System.out.println();
        }

    }


    static void pattern9() {
/*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1

*/


        int n = 5;
        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();

        }
    }


    static void pattern10() {

/*

        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15

*/


        int n = 5;
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();

        }
    }

    static void pattern11() {
/*

        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1


*/

        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                int o = i + j;
                if (o % 2 == 0) {
                    System.out.print("1 ");
                } else System.out.print("0 ");
            }
            System.out.println();

        }
    }
/*    (1 2) (1 3) (1 4) (1 5) (1 6) (1 7)
           (2 3) (2 4) (2 5) (2 6)
                (3 4) (3 5)
                

               (6 4) (6 5)
        (7 3) (7 4) (7 5) (7 6)
  (8 2) (8 3) (8 4) (8 5) (8 6) (8 7)*/


    static void pattern12() {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
              /*  if (j>=n/2 || i>=n/2){
                    break;
                }
                System.out.print(" ");
//                System.out.print("(" + i + " " + j + ") ");
            }*/
                System.out.print("(" + i + " " + j + ") ");
            }
            System.out.println();
        }
    }


    static void pattern13() {

  /*
        A
        B B
        C C C
        D D D D
        E E E E E

*/

        int n = 5;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;

            System.out.println();

        }

    }

    /*  1. Write a Program to print the right triangle star pattern.
     *
     **
     ***
     ****
     *****
     */
    static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /*

     *****
     ****
     ***
     **
     *

     */
    static void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /*    3. Write a Program to print mirrored right triangle star pattern.

     *
     **
     ***
     ****
     *****
     */
    static void pattern16(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
/*
    5. Write a Program to Print the Hollow Rectangle Star Pattern.


            * * * * *
            *       *
            *       *
            *       *
            * * * * *

    */

    static void pattern17(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i >= 2 && i <= n - 1) && (j >= 2 && j <= n - 1)) {
                    System.out.print(" ");
                } else System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern18(int n) {
   /*     6. Write a program to print the rectangle Number pattern.
        11111
        22222
        33333
        44444
        55555
     */
        int integer = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(integer);
            }
            integer++;
            System.out.println();
        }
    }


    static void pattern19(int n) {
/*        7. Write a program to print the rectangle Number pattern.

        12345
        12345
        12345
        12345
        12345
            */

        for (int i = 1; i <= n; i++) {
            int value = 1;
            for (int j = 1; j <= n; j++) {
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }

    static void pattern20(int n) {

    /*    8. Write a Program to print the Half Pyramid Number Pattern
        1
        22
        333
        4444
        55555

        */
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a);
            }
            System.out.println();
            a++;
        }
    }


    static void pattern21(int n) {
/*
        9. Write a program to print the rectangle alphabet pattern.

        A B C D E
        A B C D E
        A B C D E
        A B C D E
        A B C D E
*/

        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }


    public static void pattern22(int n) {


/*        10. Write a program to print the rectangle alphabet pattern.

                E E E E E
                D D D D D
                C C C C C
                B B B B B
                A A A A A
        */
        char ch = 'E';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print(ch);
            }
            ch--;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 8;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j>=2 && j<=n-1){
                    System.out.print("  ");
                }else System.out.print("* ");
            }
            System.out.println();
        }


    }
}
