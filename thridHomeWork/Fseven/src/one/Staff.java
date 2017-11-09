package one;

public class Staff {
    private String staff_Name;
    private String  staff_ID;

    public Staff(String staff_Name, String staff_ID) {
//        super();
        this.staff_Name = staff_Name;
        this.staff_ID = staff_ID;
    }
    public String getStaff_Name() {
        return staff_Name;
    }
    public void setStaff_Name(String staff_Name) {
        this.staff_Name = staff_Name;
    }
    public String getStaff_ID() {
        return staff_ID;
    }
    public void setStaff_ID(String staff_ID) {
        this.staff_ID = staff_ID;
    }

}
