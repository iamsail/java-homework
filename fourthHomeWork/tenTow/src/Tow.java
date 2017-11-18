import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Tow {

    public static char cha(){
        DataInputStream datainput = new DataInputStream(System.in);
        char result = 0;
        try {
            result = datainput.readChar();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String str(){
        DataInputStream datainput = new DataInputStream(System.in);
        String result = null;
        try {
            result = datainput.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static int itn(){

        DataInputStream datainput = new DataInputStream(System.in);
        int result = 0;
        try {
            result = datainput.readInt();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static float flo(){
        DataInputStream datainput = new DataInputStream(System.in);
        float result = 0;
        try {
            result = datainput.readFloat();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static double dou(){
        DataInputStream datainput = new DataInputStream(System.in);
        double result = 0;
        try {
            result = datainput.readDouble();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Tow.itn());
    }
}
