package String;

/**
 * 315. *Find the First Non-Repeating Character in a String:* 🔠
 *    - 🎲 *Input:* "geeksforgeeks"
 *    - 🎯 *Output:* First non-repeating character: "f"
 */
public class FirstNonRepeating {
    public static void findFirstNonRepeatingChar(String str) {

        int[] freq = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                System.out.println("First Non Repeating Character : "+str.charAt(i)); ;
                break;
            }
        }
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        findFirstNonRepeatingChar(str);

    }
}
