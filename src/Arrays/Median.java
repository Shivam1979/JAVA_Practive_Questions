package Arrays;

public class Median { //10. Find the median of the given array.
    public static void main(String[] args) {

        int arr  [] = {10 ,12 ,45 ,54 ,1 ,32 ,56 ,87 ,45,44  };
        float l = arr.length;
        System.out.println("Length  of array "+l);
        int med = 0;
        sortArr(arr);
        if ((l/2) % 2 ==0){
            med = ((arr[(int) (l/2)]) + ((arr[(int) ((l/2)-1)])))/2;
        }else if ((l/2) % 2 != 0){
            med = (arr[(int) ((l/2)+1)]);
        }
        System.out.println("Median is "+med);
        System.out.print ("Sorted array  : ");
        for (int o : arr) {
            System.out.print(+o+" ");
        }
    }
   static void sortArr(int[] arr) { // Selection sort
       for (int i = 0; i < arr.length ; i++) {
           for (int j = i+1; j < arr.length ; j++) {
               if (arr[i] > arr[j]){
                   int temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
               }
           }
       }
    }
}
