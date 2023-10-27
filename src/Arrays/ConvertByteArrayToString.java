package Arrays;

/**
 * 304. *How to convert a byte array to String? (solution)*
 * 🎲 *Input:*
 * - Byte array: [72, 101, 108, 108, 111]
 * 🎯 *Output:*
 * - Converted string: "Hello"
 */
public class ConvertByteArrayToString {
    public static void main(String[] args) {
        int arr[] = {72, 101, 108, 108, 111};
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            char ch = (char) num;
            str = str + ch;
        }
        System.out.println(str);
    }
}
