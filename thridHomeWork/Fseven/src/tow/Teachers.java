package tow;

import one.Teacher;

public class Teachers {
    private Teacher teacher[]=null;

    public Teachers(Teacher[] teacher) {
        this.teacher = teacher;
    }
    public void Output(){
        for (Teacher t : teacher) {
            System.out.println(t.getTeacher_Name()+"  "+t.getTeacher_ID());
        }
    }
}
