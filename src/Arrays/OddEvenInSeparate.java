package Arrays;

public class OddEvenInSeparate {
    static void oddEven(int[] arr) {
        int counteven = 0, countodd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counteven++;
            } else countodd++;
        }
        int odd[] = new int[countodd];
        int even[] = new int[counteven];
        int o = 0, e = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even[e] = arr[i];
                e++;
            } else {
                odd[o] = arr[i];
                o++;
            }
        }
        System.out.println("Odd :");
        print(odd);
        System.out.println("Even :");
        print(even);
    }
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {56, 1, 23, 78, 98, 212, 565, 45, 55, 6, 2, 11};
        oddEven(arr);
    }
}
