package Numbers;

import java.util.Scanner;

public class Area_circle {
    public static void main(String[] args) {
        // here we need to find the area of Circle
        // Formula  , A = PI* R*R;
        Scanner sc = new Scanner(System.in);
        float pie = (float) Math.PI;
        int radius = sc.nextInt();
        float area = pie * (radius * radius);
        System.out.println(area);
    }
}
