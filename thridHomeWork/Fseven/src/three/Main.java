package three;


import one.Teacher;
import tow.Teachers;

public class Main {
    public static void main(String args[]){
	   /* 使用包，只有一个类(主类)，
	    * 主方法中创建一个师资类对象，
	    * 调用它的方法建立一个含有3个教师的师资，
	    * 然后调用方法输出师资。
	    * */
        Teacher t[]=new Teacher[3];
        t[0] = new Teacher("IOS", "1000");
        t[1] = new Teacher("Android", "1001");
        t[2] = new Teacher("WinPhone", "1002");
        Teachers teachers = new Teachers(t);
        teachers.Output();
    }
}
