package tow;
import one.Student;
import one.Teacher;

public class Classes {
    private Student[] students;

    public Classes(Student[] students) {
        super();
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public void Output(){
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
