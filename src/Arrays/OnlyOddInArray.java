package Arrays;

public class OnlyOddInArray {
    static boolean isOdd (int arr[])
    {
        boolean check = true;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 1)
            {
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main (String[]args)
    {
        int arr[] = { 12, 56, 78, 90, 21 };

        if (isOdd (arr))
        {
            System.out.println ("Contain even element");
        }
        else
            System.out.println ("Contain odd element");
    }
}
