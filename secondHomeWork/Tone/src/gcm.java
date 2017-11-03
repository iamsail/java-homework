import java.util.Scanner;

public class gcm {
    public static int Loop(int large, int small){
        int temp = 0;
        while(small != 0){
            temp = large % small;
            large = small;
            small = temp;
        }
        return large;
    }

    public static int Recursive(int large, int small){
        if(large % small == 0){
            return small;
        }else{
            return  Recursive(small,large%small);
        }
    }


    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int large,small;

        if(x >= y){
            large = x;
            small = y;
        }else{
            large = y;
            small = x;
        }
        if(large == 0 || large == 0) return;

        System.out.println("循环方法  " + x + "  " + y + "  的最大公约数是  " + Loop(large,small) );
        System.out.println("递归方法  " + x + "  " + y + "  的最大公约数是  " + Recursive(large,small));
    }
}
