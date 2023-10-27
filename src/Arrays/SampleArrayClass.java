package Arrays;

public class SampleArrayClass {
    int arr[] = {12, 43, 22, 87, 90, 34, 11, 23, 87, 90, 115};
    int arr1[] = {12, 22, 34, 87, 90, 99, 115, 256, 330};

    public  void printArr(int arr []){
        System.out.print("Array  : ");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
