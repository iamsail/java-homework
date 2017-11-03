public class car {

    static class Complex{
        int RealPart;
        int ImaginaryPart;
        Complex(){
            RealPart = 0;
            ImaginaryPart = 0;
        }

        Complex(int r, int i){
            RealPart = r;
            ImaginaryPart = i;
        }

        Complex complexAdd(Complex a){
            Complex temp = new Complex();
            temp.RealPart = RealPart + a.RealPart;
            temp.ImaginaryPart = ImaginaryPart + a.ImaginaryPart;
            return temp;
        }

        public String toString(){
            return (RealPart + "+" + ImaginaryPart + "i");
        }
    }


    public static void main(String args[]){
        Complex a,b,c;
        a = new Complex(2,2);
        b = new Complex(4,4);
        c =  a.complexAdd(b);
        System.out.println("复数是 ");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }


}
