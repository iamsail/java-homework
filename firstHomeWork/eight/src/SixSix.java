import java.util.*;

public class SixSix {
    public  static void main(String[] args){
        int[][] numbers =new int[6][6];
        int i,j;
        double sum = 0;
        for( i = 0; i < 6; i++){
            for( j = 0; j < 6; j++){
                numbers[i][j] = (int)(10+Math.random()*(20-10+1));
                if(i == j) sum += Math.sqrt(numbers[i][j]);
            }
        }

        for( i = 0; i < 6; i++){
            for( j = 0; j < 6; j++){
                if(j < 5) System.out.print(numbers[i][j] + " ");
                else  System.out.println(numbers[i][j]);
            }
        }

        System.out.println(sum);
    }
}
