//public class Outer {
//}


public class Outer  {
    public Outer(){
        System.out.println("OuterClass Object!");
    }
    private class  Inner1 {
        private  Inner1(String s){
            System.out.println(s);
        }
    }

    static class Inner2  {
        Inner2(String s){
            System.out.println(s);
        }
    }

    public static void  main(String[] args)  {
        Outer ob= new Outer();
//        Outer.Inner1 ib1 = ob.new Inner1("InnerClass1 Object!");
        Outer.Inner1 ib1 = ob.new Inner1("InnerClass1 Object!");
        Inner2 ib2=new Inner2("InnerClass2 Object!");
    }
}