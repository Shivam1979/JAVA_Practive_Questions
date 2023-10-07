package Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int arr[] = {55, 22, 33, 66, 99, 88, 11};
        int n = arr.length-1;
        int key = 90;
        System.out.println("Inserting value is :  "+ key);
        System.out.println("Before inserting the value : ");
        for (int aa: arr) {System.out.println(aa + " ");}
        insertinstarting(arr,n,key);
        System.out.println();
        System.out.println("After inserting the value : ");
        for (int aa: arr) {System.out.println(aa + " ");} }
    private static void insertinstarting(int[] arr, int n, int value) {

        for(int i=n-1;i>=0;i--) {arr[i+1]=arr[i];} arr[0]=value;
    }
}
