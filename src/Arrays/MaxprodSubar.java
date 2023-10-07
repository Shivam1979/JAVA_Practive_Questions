package Arrays;

public class MaxprodSubar {


    public static int pro(int arr[], int n) {
        int maxx = Integer.MIN_VALUE;  // we take a minimum value to compare with the product
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++) {
                
                int Maxprod = 1;
//                here we use Maxxprod to store the value of product given range
                for (int k = i; k <= j; k++) // we run loop  i --> j to get the product of given range
                    Maxprod *= arr[k]; // we multiply each of them
                maxx = Math.max(maxx, Maxprod); // compare the value and store it in to maxx
            }
        return maxx;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 0};
        int n = arr.length;
        int f = pro(arr, n);
        System.out.println(f);
    }
}
