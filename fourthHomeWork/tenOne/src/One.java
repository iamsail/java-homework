import java.io.*;
public class One {
    public static void main(String args[]){
        File file1 = new File("myfile1.txt");
        File file2 = new File("myfile1.txt");
        String data="I am a student.";
        char dat[]=data.toCharArray();
        FileWriter filewriter1 =null;
        FileWriter filewriter2=null;
        BufferedReader bufferedReader=null;
        try {
            filewriter1 = new FileWriter(file1);
            //文件存在直接写入
            if(file1.exists()){
                filewriter1.write(data);
                filewriter1.close();
            }else{
                //文件不存在先创建，然后写入
                file1.createNewFile();
                filewriter1.write(data);
                filewriter1.close();
            }
            filewriter2 = new FileWriter(file2);
            if(file2.exists()){
                filewriter2.write(new String(dat));
                filewriter2.close();
                bufferedReader=new BufferedReader(new FileReader(file2));
                String string=null;
                StringBuffer buffer=new StringBuffer();
                if((string=bufferedReader.readLine())!=null){
                    buffer.append(string);
                }
                bufferedReader.close();
                System.out.println(buffer.toString());
            }else{
                //文件不存在先创建，然后写入
                file2.createNewFile();
                filewriter2.write(new String(dat));
                filewriter2.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
