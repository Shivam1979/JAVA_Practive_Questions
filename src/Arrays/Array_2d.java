package Arrays;

import java.util.Scanner;

public class Array_2d {
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number row");
        int a = sc.nextInt();
        System.out.println("Enter a number coulumn");
        int b = sc.nextInt();
        int arr[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }


        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }*/




        public static void main(String[] args) {
            //int arr[][] = {{1, 2, 5}, {7, 9, 11}, {3, 4, 8}};
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of row:");
            int m=sc.nextInt();
            System.out.println("Enter the number of columns:");
            int n=sc.nextInt();
            //print the array
            int arr[][]=new int[m][n];
            System.out.println("Enter the element of a array");

            System.out.println("2D Array:");
            for (int i = 0; i <m; i++) {
                for (int j = 0; j <n; j++) {
                    arr[i][j]= sc.nextInt();
                   // System.out.println("Element of the array are:");
                    for (int k = 0; k < m; k++) {
                        for (int l = 0; l < n; l++) {
                            System.out.print(arr[k][l]+" ");
                        }
                    }
                    //   System.out.print(arr[k][l] + " ");
                }
                System.out.println();
            }// sum of ARAAY
            for (int i = 0; i < m; i++) {
                int sum =0;

                for (int j = 0; j < n; j++) {
                    sum=sum+arr[i][j];

                }
                System.out.println("sum of "+(i+1)+"is :" +sum);
            }

    }
}
