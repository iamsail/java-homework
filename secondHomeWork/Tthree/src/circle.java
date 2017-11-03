import java.util.Scanner;

public class circle {
    static class Inital{
        double x,y,r;
        Inital(){
            x = 0;
            y = 0;
            r = 0;
        }

        Inital(double x,double  y,double r){
            x = x;
            y = y;
            r = r;
        }

        public double zc(double r){
            double perimeter = 0;
            perimeter = Math.PI * r * 2;
            return perimeter;
        }

        public double mj(double r){
            double area = 0;
            area = Math.PI * r * 2;
            return area;
        }
    }


    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        double x = in.nextInt();
        double y = in.nextInt();
        double r = in.nextInt();
        Inital a = new Inital(x,y,r);
        System.out.println("a.r是  " + r);
        System.out.println("周长是  " + a.zc(r));
    }
}
