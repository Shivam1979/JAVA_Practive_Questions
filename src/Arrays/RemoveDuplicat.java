package Arrays;

public class RemoveDuplicat {

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 3, 3, 3, 4, 5};
                  //{ 1,2,3,4,5,3,3,345}
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println(i+1);
        int arr1 [] = new int[i+1];
        for (int j = 0; j <arr1.length; j++) {
            arr1[j] = arr[j];
        }
        for (int j = 0; j <arr1.length ; j++) {
            System.out.print(arr1[j]+"  ");
        }
    }
}
