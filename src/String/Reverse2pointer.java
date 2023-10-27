package String;

import java.util.Arrays;

public class Reverse2pointer {


    public static void main(String[] args) {
        String str = "shivam";
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length-1;
        while (start<end){
            //swap
            char swap = ch[start];
            ch[start] =  ch[end];
            ch[end] = swap;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(ch));
    }
}
