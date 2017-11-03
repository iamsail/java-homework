import java.util.*;
public class IsLeapYear {
    public static  boolean isLeapYear(int year){
       boolean flag = false;
        if((year % 4 == 0 ) && (year % 100 != 0 ) || (year % 400 == 0  )){
            flag = true;
        }
        return  flag;
    }


    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter year? ");
        int year = in.nextInt();
        if ((isLeapYear(year))) {
            System.out.println("闰年");
        } else {
            System.out.println("非闰年");
        }
    }
}
