public class One extends Thread{
    private  int a;
    private  int b;
    private  String name;
    public  One(String m ,int a, int b){
        this.name = m;
        this.a = a;
        this.b = b;
    }
    public void run(){
        if(a == 1){
            try {
                for(int i = 0; i <= b; i++){
                    System.out.println(name + ": " + i);
                    Thread.sleep(1000);
                }
            }catch (Exception e){
                System.out.println(e.toString());
            }
        }
        if(a == 3){
            try{
                for(char c = 97; (c - 97 )<=b ; c++){
                    System.out.println(name + ": " + c);
                    Thread.sleep(3000);
                }
            }catch (Exception e){
                System.out.println(e.toString());
            }
        }
    }

    public static void main(String args[]){
        Thread timerOne = new One("first",1,10);
        Thread timerTwo = new One("seconde",3,5);
        timerOne.start();
        timerTwo.start();
    }
}
