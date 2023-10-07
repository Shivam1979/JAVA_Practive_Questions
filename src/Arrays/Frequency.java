package Arrays;

public class Frequency {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 6, 4 , 4, 5, 7, 8, 7};


        for (int i = 0; i < arr.length; i++) {
            int k =  arr[i]; //  in every loop  of i the value will change of
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == k) {
                    count++;
                }
            }

            System.out.println(k + " is occure " + count + " times");
            count =0; // reset the count
        }



    }
    }


