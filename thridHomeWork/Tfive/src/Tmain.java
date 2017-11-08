import java.util.Scanner;

class Person {
    private String number;
    private String name;
    private String sex;
    Person(){}
    Person(String Number,String Name){
        number = Number;
        name = Name;
    }

    public void changeNumber(String x){
        number = x;
    }

    public void changeName(String x){
        name = x;
    }

    public String getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }
}


class Teacher extends Person{
    private String Department;
    Teacher(String De,String Number,String Name){
        super(Number,Name);
        Department = De;
    }

    public void changeDepartment(String DeOther){
        Department = DeOther;
    }

    public String getDepartment(){
        return Department;
    }
}

class Student extends Person{
    private String _class;
    Student(String class_,String Number,String Name){
        super(Number,Name);
        _class = class_;
    }

    public void changeClass(String classOther){
        _class = classOther;
    }

    public String get_Class() {
        return _class;
    }
}

class Classes{
    private String className;
    private Student nameList [] = new Student[100];
    Classes(String class_name){
        className = class_name;
    }

    public int createNameList(){
        System.out.println("请输入该班级人数");
        int i; // 班级人数
        String number;
        String name;
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        for(int j = 0; j < i; j++){
            number = in.next();
            name = in.next();
            nameList[j] = new Student(className,number,name);
        }
        return i;
    }

    public void outPut(int i){
        System.out.printf("学号\t");
        System.out.printf("姓名\t");
        System.out.printf("班级名称\t");
        System.out.println();
        for(int k = 0; k < i; k++){
            System.out.printf(nameList[k].getNumber() + "\t");
            System.out.printf(nameList[k].getName() + "\t");
            System.out.printf(nameList[k].get_Class() + "\t");
            System.out.println();
        }
    }
}

public class Tmain {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入班级名称");
        String demo_class;
        demo_class = in.next();
        Classes demo =  new Classes(demo_class);
        demo.outPut(demo.createNameList());

    }
}


