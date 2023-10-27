package Arrays;

public class SecondSmall {
    //194. *Find the second smallest element in an array in Java?* 🤔
    public static void main(String[] args) {
        SampleArrayClass sr = new SampleArrayClass();
        sr.printArr(sr.arr);
        System.out.println("Second minimum: " + secondSmall(sr.arr));
    }
    static int secondSmall(int[] arr) { //TC (nearer to O(n);
        int minn = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minn > arr[i]) {
                minn = arr[i];
            }
        }
        int secondMinn = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ((secondMinn > arr[i]) && (arr[i] < minn)) {
                secondMinn = arr[i];
            }
        }
        return secondMinn;
    }
}
