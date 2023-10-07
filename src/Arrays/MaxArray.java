package Arrays;
////2.Find the largest number in an array
public class MaxArray {
    public static void main(String[] args) {
        int [] arr = {65,45,89,98,12,22,56,55};
        int maaxx = max(arr);
        System.out.println("Maximum  in array :- "+maaxx);
    }
    static int max(int arr[]){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }

        }
        return max;
    }
}
