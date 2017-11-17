import java.util.Scanner;

public class Tow {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("字符串转为十进制整数");
        String  aimString = in.nextLine();
        System.out.println(Integer.parseInt(aimString));

        System.out.println("字符串转为二进制整数");
        aimString = in.nextLine();
        System.out.println(Integer.toBinaryString(Integer.parseInt(aimString)));


        System.out.println("字符串转为实数");
        aimString = in.nextLine();
        System.out.println(Double.parseDouble(aimString));


        System.out.println("字符串转为布尔型");
        aimString = in.nextLine();
        System.out.println(Boolean.parseBoolean(aimString));

    }
}
