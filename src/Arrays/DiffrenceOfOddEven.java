package Arrays;

public class DiffrenceOfOddEven {

    static int diffrence(int arr[]) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumEven = sumEven + arr[i];
            } else sumOdd = sumOdd + arr[i];
        }
        int diffrence = sumEven - sumOdd;
        return diffrence;
    }
    public static void main(String[] args) {
        SampleArrayClass ob = new SampleArrayClass();
        ob.printArr(ob.arr);
        System.out.println();
        System.out.println("Diffrence B/W the Even and Odd : "+ diffrence(ob.arr));

    }
}
