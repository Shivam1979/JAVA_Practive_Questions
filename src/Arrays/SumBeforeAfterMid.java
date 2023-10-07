package Arrays;
//
// 100. Write the program to find the sum of elements before the mid element and after the mid in array

public class SumBeforeAfterMid {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 2, 89, 5, 2};
        int mid = arr.length/2;
        int beforemid = 0;
        int aftermid = 0;
        for (int i = 0; i <=mid ; i++) {
            beforemid += arr[i];
        }
        for (int i = mid+1; i <arr.length ; i++) {
            aftermid +=arr[i];
        }
        System.out.println("Sum before mid  : "+beforemid);
        System.out.println("Sum after mid  : "+aftermid);
    }


}
