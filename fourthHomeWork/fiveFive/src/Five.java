import java.util.Arrays;

public class Five {
    public static void main(String args[]){
        int []arr = new int[10];
        System.out.println("排序前");
        for(int i = 0; i < 10; i++){
            arr[i] = (int)(Math.random() * 1000);
            System.out.println(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println("排序后");
        for(int i = 0; i < 10; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
