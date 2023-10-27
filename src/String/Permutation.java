package String;

// 274. *How do you find all the permutations of a string?
public class Permutation {
    static void swap(char ar[], int i, int fi) {
        char temp = ar[i];
        ar[i] = ar[fi];
        ar[fi] = temp;
    }

    static void permutation(char[] ar, int fi) {
        if (fi == ar.length - 1) {
            System.out.println(ar);
            return;
        }
        for (int i = fi; i < ar.length; i++) {
            swap(ar, i, fi);
            permutation(ar, fi + 1);
            swap(ar, i, fi);

        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutation(str.toCharArray(), 0);
    }
}
