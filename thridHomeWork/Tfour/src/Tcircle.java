import java.util.Scanner;

     class Circle{
        private double x,y,r;
         Circle(){
            x = 0;
            y = 0;
            r = 0;
        }

         Circle(double xx,double  yy,double rr){
            x = xx;
            y = yy;
            r = rr;
        }

         double zc( ){
             System.out.println("圆的面积是in  " + Math.PI * r * 2);
            return  Math.PI * r * 2;
        }

         double mj(){
            return Math.PI * r * r;
        }
    }

    class Column extends Circle{
         private double h;
         Column(double xx,double yy,double rr,double hh){
             super(xx,yy,rr);
             h = hh;
         }
         double mj(){
             return super.mj() * 2 + super.zc() * h;
         }

         double tj(){
            return super.mj() * h;
        }
    }

    public class Tcircle{
         public static void main(String args[]){
             double x,y,r,h;
             System.out.println("请输入x,y,r,h");
             Scanner in = new Scanner(System.in);
             x = in.nextInt();
             y = in.nextInt();
             r = in.nextInt();
             h = in.nextInt();
             Circle one = new Circle(x,y,r);
             Column tow = new Column(x,y,r,h);
             System.out.println("Pi " + Math.PI);
             System.out.println("圆的面积是 " + one.mj());
             System.out.println("圆柱的面积是 " + tow.mj());
             System.out.println("圆柱的体积是 " + tow.tj());
         }
    }



