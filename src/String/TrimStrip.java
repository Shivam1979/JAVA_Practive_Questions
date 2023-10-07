package String;
public class TrimStrip {
    public static void main(String[] args) {


        int a = 10;
        int b = 10/0;


        int arr[] = {7, 65, 23, 1, 402, 44, 90};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j <= arr.length; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(arr[k]+" ");

                }
                System.out.println();
            }
            System.out.println();

        }

        //  both the trim and strip method remove the starting and end
        // space from String

    }
}
