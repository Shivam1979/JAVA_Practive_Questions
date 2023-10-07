package Arrays;

public class RemoveDupli {

static int removedDupli(int arr []){
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[j] != arr[i]){
            arr[j+1] = arr[i];
            j++;
        }
    }
    return j;
}
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 3, 4, 5, 6};
        int b = removedDupli(a);
        for (int i = 0; i <= b; i++) {
            System.out.print(a[i] +" ");

        }
    }
}
