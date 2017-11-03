import java.util.Scanner;
import java.util.*;

public class TheMinNumber {
    public  static void main(String[] args){
        int[] numbers=new int[10];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            numbers[i] = in.nextInt();
        }
        Arrays.sort(numbers,0,10);
        System.out.println(numbers[0]);
    }
}
