package one;

public class Teacher {
    private String teacher_Name;
    private String  teacher_ID;

    public Teacher(String teacher_Name, String teacher_ID) {
        this.teacher_Name = teacher_Name;
        this.teacher_ID = teacher_ID;
    }
    public String getTeacher_Name() {
        return teacher_Name;
    }
    public void setTeacher_Name(String teacher_Name) {
        this.teacher_Name = teacher_Name;
    }
    public String getTeacher_ID() {
        return teacher_ID;
    }
    public void setTeacher_ID(String teacher_ID) {
        this.teacher_ID = teacher_ID;
    }

}
