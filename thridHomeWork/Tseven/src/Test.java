//public class Test {
//
//}


interface I{ String getS(); }
class Test  {
    public static void main(String args[]){
    System.out.println(new I(){
        public String getS()
        { return "接口和内部类！";}
    }.getS());
    }
}