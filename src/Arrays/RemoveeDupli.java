package Arrays;

public class RemoveeDupli {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 3, 3, 3, 4, 5};
        //195. *Remove duplicate elements from an array.* 🗑
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[j] != arr[i]){
                arr[j+1] = arr[i];
                j++;
            }
        }
        System.out.println("Number of unique element : " +(j+1));
        for (int read : arr
             ) {
            System.out.print(read +" ");

        }

    }
}
