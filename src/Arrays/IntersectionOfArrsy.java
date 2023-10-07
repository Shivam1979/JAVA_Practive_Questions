package Arrays;

public class IntersectionOfArrsy {
//163. 🔀 Find the intersection of two sorted arrays in Java.
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 3, 4, 5, 6};


        int b[] = {2, 3, 3, 4, 5, 6, 6, 7};
        int ans[] = new int[a.length];
        int vis[] = new int[b.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && vis[j] == 0) {
                    ans[k] = a[i];
                    k=k+1;
                    vis[j] = 1;
                    break;
                }
                if (b[j] > a[i]) break;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
