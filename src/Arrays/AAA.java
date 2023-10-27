package Arrays;

public class AAA {


    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 1, 3, 8, 9, 33, 23};

        int i = 0;
        int n = arr.length-1;
        for (int j = 0; j < arr.length; j++) {

            System.out.println(i + " " + j);




          if (j==n && i<n){
              j = i;
              i++;
          }


        }
    }
}
