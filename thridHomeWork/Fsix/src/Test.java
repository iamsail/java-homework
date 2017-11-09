interface Shape{
    public double area();
}

class triangle implements Shape{
    int a,b,c;
    public triangle(int A, int B, int C){
        a = A;
        b = B;
        c = C;
    }
    public  double area(){
        int p = (a + b + c) / 2;
        return  Math.sqrt( p * (p - a)* (p - b)* (p - c));
    }
}

class rectangle implements Shape{
    int a,b;
    public rectangle(int A,int B){
        a = A;
        b = B;
    }

    public double area(){
        return  a * b;
    }
}

class circle implements Shape{
    int r;
    public circle(int R){
        r = R;
    }
    public double area(){
        return Math.PI * r * r;
    }
}

public class Test {
    public static void main(String args[]){
        Shape s[] = new Shape[3];
        s[0] = new triangle(3,4,5);
        s[1] = new rectangle(3,4);
        s[2] = new circle(3);
        System.out.println("三角形的面积是 " + s[0].area() + "\n长方形的面积是 " + s[1].area() + "\n圆的面积是 " + s[2].area());
    }
}
