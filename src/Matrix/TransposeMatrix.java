package Matrix;// Java representation of finding shortest
// distance between node i and j

import java.util.Collections;
import java.util.Vector;

class GFG {
    static int ShortestDistance(int i, int j) {
        int sortest_path = 0;
        Vector<Integer> v1 = new Vector<Integer>(),
                v2 = new Vector<Integer>();
        int p1 = i;
        int p2 = j;
        while (i != 0) {
            v1.add(i % 2);
            i = i / 2;
        }
        while (j != 0) {
            v2.add(j % 2);
            j = j / 2;
        }
        Collections.reverse(v1);
        Collections.reverse(v2);
        int m = v1.size(), n = v2.size(), k = 0;
        if (m < n) {
            while (k < m && v1.get(k) == v2.get(k))
                k++;
        } else {
            while (k < n && v1.get(k) == v2.get(k))
                k++;
        }
        sortest_path =  m + n - 2 * k;
        return sortest_path;
    }
    public static void main(String args[]) {
        System.out.println(ShortestDistance(1, 2));
        System.out.println(ShortestDistance(3, 14));
    }
}


