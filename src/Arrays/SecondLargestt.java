package Arrays;

public class SecondLargestt {

    public static void main(String[] args) {
        int[] arr = {12, 32, 11, 65, 78, 87, 45, 69};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("MAX " + largest);

        int secondLArge =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (secondLArge < arr[i]  && largest > arr[i]){
                secondLArge = arr[i];
            }
        }
        System.out.println("Second max "+secondLArge);
    }
}
