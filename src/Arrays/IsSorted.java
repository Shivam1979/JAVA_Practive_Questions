package Arrays;

public class IsSorted {

    static boolean isSorted(int arr [] ){ // descending order
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1] ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr [] = {1,1,2,3,4,9,7,8};
//        System.out.println(isSorted(arr));
        if (isSorted(arr)){
            System.out.println("Array is Sorted ");
        }else System.out.println("Array is not Sorted ");
    }
}
