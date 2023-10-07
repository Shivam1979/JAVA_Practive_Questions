package Arrays;

public class Binary_search {

    static String Bina(int[] arr, int key){

        int end= arr.length-1;
        int start = 0;
        while (start <= end){
            int mid = (start + end)/2;
            if (arr[mid] == key){
                 //.out.println("Key found at index  : " + mid);
                return  ""+mid;
            }else if (arr[mid] > key){
                end = mid-1;
            }else if (arr[mid] < key){
                start = mid +1;
            }
        }
        return "not Found";
    }
    public static void main(String[] args) {
        int arr[] = {21, 23, 36, 52, 54, 58, 65, 89, 96};
        int key = 89; // we need to find the index where this key is present
        String n = Bina(arr,key);
        System.out.println(n);

    }

}
