package Arrays;

public class Missing {






    static void missing(int arr[]){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
        }
        for (int i = arr[0]; i <=arr[arr.length-1] ; i++) {
            sum2 = sum2 + i;
        }

        int missing_number = sum2-sum1;

        System.out.println("Missing number :"+missing_number);
    }


    public static void main(String[] args) {
        int arr [] = {7,8,9,11,12,13};



    }
}
