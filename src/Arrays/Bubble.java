package Arrays;
//
public class Bubble {
    public static void main(String[] args) {
        int arr [] =  {2,6,5,9,8,5,89,56,45,23,11,2222};
        bubble(arr);
        print(arr);
    }
    static  void  bubble(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                // ascending order
                if (arr[j]>arr[j+1]){
                    //swap
                    int swap = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = swap;
                }
            }
        }

    }
    static  void print(int arr [] ){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");

        }
    }
}

