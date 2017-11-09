package one;

public class Student {
    private String student_Name;
    private String  student_ID;

    public Student(String student_Name, String student_ID) {
//        super();
        this.student_Name = student_Name;
        this.student_ID = student_ID;
    }
    public String getStudent_Name() {
        return student_Name;
    }
    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }
    public String getStudent_ID() {
        return student_ID;
    }
    public void setStudent_ID(String student_ID) {
        this.student_ID = student_ID;
    }

}
