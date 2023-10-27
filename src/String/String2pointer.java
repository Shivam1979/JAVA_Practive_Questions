package String;

public class String2pointer {
//196. *Check if a string is a palindrome using the two-pointer approach.* 🔄
    public static void main(String[] args) {
        String str = "madam";
        int e = str.length()-1;
        int s = 0;
        boolean isPalindrome =  true ;
        while (e>=s){
            if (str.charAt(s) != str.charAt(e)){
isPalindrome = false;
                break;
            }
            s++;
            e--;
        }
        System.out.print(str);
        if (isPalindrome){
            System.out.println(" is palindrome  ");
        }else System.out.println(" not a Palindrome");
    }

}
