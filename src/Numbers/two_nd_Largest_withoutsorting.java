package Numbers;

public class two_nd_Largest_withoutsorting {


    public static void main(String[] args) {
        int arr[] = {7, 65, 23, 1, 402, 44, 90};
      int FirstMax = Integer.MAX_VALUE;
      int SecondMax = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] < FirstMax){
                SecondMax = FirstMax;
                FirstMax = arr[i];
                System.out.println("First "+FirstMax);
                System.out.println("Second "+SecondMax);
            }else if (arr[i]>SecondMax &&  arr[i] !=FirstMax){
                SecondMax = arr[i];
                System.out.println("Second "+SecondMax);
            }
        }
        System.out.println(SecondMax);

    }
}
