import java.util.*;

public class PrintMonth {
    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){

            System.out.print("enter month? ");
            int month = in.nextInt();
            if(month == 0){
                break;
            }
            switch (month){
                case 1: System.out.println("one"); break;
                case 2: System.out.println("tow"); break;
                case 3: System.out.println("three");break;
                case 4: System.out.println("four");break;
                case 5: System.out.println("five");break;
                case 6: System.out.println("six");break;
                case 7: System.out.println("seven");break;
                case 8: System.out.println("eight");break;
                case 9: System.out.println("nine");break;
                case 10: System.out.println("ten");break;
                case 11: System.out.println("eleven");break;
                case 12: System.out.println("twelve");break;
                default:System.out.println("your input is wrong");
            }
        }
    }
}
