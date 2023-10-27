package Arrays;

public class Bubblesort3 {
    static  void bubbleSort(int arr [] ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        SampleArrayClass ob = new SampleArrayClass();
        System.out.println("Before sorting : ");
        ob.printArr(ob.arr);
        bubbleSort(ob.arr);
        System.out.println("After sorting : ");
        ob.printArr(ob.arr);

    }


}
