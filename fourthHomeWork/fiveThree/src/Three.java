import java.util.Scanner;

public class Three {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = "";
        StringBuffer sb = new StringBuffer();

        sb.append(in.nextLine());
        System.out.println(sb);
        s = sb.toString();
        System.out.println(s);

        System.out.println("abc第一次出现的位置 " + s.indexOf("abc"));
        System.out.println("abc最后一次出现的位置 " + s.lastIndexOf("abc"));
    }
}
