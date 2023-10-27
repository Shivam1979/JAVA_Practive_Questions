package String;

public class TwoPointer {
    public static void main(String[] args) {
     int arr [] = {1,2,3,8,-3,-8,20};
     int currsum=0;
     int maxsum=arr[0];

     for(int i=0;i<arr.length;i++){
         currsum= currsum+arr[i];
         if(currsum>maxsum){
             maxsum= currsum;
         }
     }
        System.out.println(maxsum);
    }
}
