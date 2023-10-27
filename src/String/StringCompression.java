package String;

import java.util.Arrays;

public class StringCompression {
    /**
     * Input: S = “geeksforgeeks”
     * Output:
     * e, count = 4
     * g, count = 2
     * k, count = 2
     * s, count = 2
     *
     * @param args
     */

    public static void main(String[] args) {
        String str = "tanujhafrombihar";
        int len = str.length();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
        for (int i = 0; i < len; i++) {
            int count = 1;

            // Counting the occurrences of each character
            while (i < len - 1
                    && sortedStr.charAt(i)
                    == sortedStr.charAt(i + 1)) {
                count++;
                i++;
            }

            // Printing the duplicate character and its
            // count
            if (count > 1) {};
        }
    }


}
