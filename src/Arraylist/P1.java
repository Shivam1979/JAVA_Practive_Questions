package Arraylist;

import Arrays.Demo;

import java.util.ArrayList;

public class P1{
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        System.out.println(swap(a,b));
    }

    static ArrayList swap(int a, int b ) {
        a=a+b;
        b=a-b;
        a=a-b;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(a);
        ans.add(b);
        return ans;



    }
}
