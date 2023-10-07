package String;

public class CountOccur {

//  the count for the occurrence of a particular one character in a string?

    static  int countOccur(String str , char ch){

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "shivam singh";
        char ch = 'i';
        System.out.println("Number of occurance of '"+ch +"' is : "+countOccur(str ,ch));
    }
}
