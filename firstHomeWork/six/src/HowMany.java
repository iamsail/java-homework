import java.util.*;

public class HowMany {
    public static  void main(String[] args){
        int count = 0,lastNumber = 0;
        for(int i = 10000; i <= 99999 ; i++){
            lastNumber = i;
            lastNumber = lastNumber % 10000;
            lastNumber = lastNumber % 1000;
            lastNumber = lastNumber % 100;
            lastNumber = lastNumber % 10;
          if( lastNumber == 6 && lastNumber % 3 == 0){
                count++;
          }
        }
        System.out.println(count);
    }
}
