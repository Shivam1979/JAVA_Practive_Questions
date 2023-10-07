package Matrix;

public class Findthenum {
    static void Findvalue(int key, int[][] arr) {
        for (int i = 0; i <arr[0].length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i][j]==key){
                    System.out.println("key "+key+" Found at : ("+i+","+j+")" );
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}

        };
        int key1 = 10;
        int key2 = 20;
        int key3 = 30;
        int key4 = 8;
        Findvalue(key1, arr);
        Findvalue(key2, arr);
        Findvalue(key3, arr);
        Findvalue(key4, arr);

    }


}
