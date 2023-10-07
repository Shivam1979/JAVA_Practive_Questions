package Arrays;
//14. Find all repeating elements in an array
public class AllRepeating {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 4, 5, 2};
        int arr1[] = new int[arr.length];
        int k =0;
        // by two pointer method
//        we take a two pointer one in first index and
//        2nd on  (first +1) , and then we compare the value of both
//        if we find that walue again it means  it is repeating
//        and we add in new array
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                   arr1[k++] = arr[i];}}}
        //print
        for (int i = 0; i < k; i++) {
            if (arr1[i] != arr1[i+1]){
                System.out.println(arr1[i]);
            }
        }
    }
}
