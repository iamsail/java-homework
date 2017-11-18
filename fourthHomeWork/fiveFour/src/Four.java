import java.util.Calendar;
import java.util.Scanner;

public class Four {
    public static void main(String args[]){
        Calendar calendar = Calendar.getInstance();
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            int a = (int)(Math.random() * 50);
            int minutes = calendar.get(Calendar.MINUTE);
            int seconds = calendar.get(Calendar.SECOND);
            int b = (int)((seconds + minutes) / 2.4);
            System.out.println(a+"+"+b+"=");
            int sum;
            sum = in.nextInt();
            if(sum == a + b){
                System.out.println("对");
            }else {
                System.out.println("错");
            }
        }
    }
}
