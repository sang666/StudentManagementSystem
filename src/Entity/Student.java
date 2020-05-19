package Entity;

public class Student {

    private Integer sno;
    private String  sname;
    private String sex;
    private String  academy;
    private Integer  grade;
    private Integer  phone;


    public Student(Integer sno, String sname, String sex, String academy, Integer grade, Integer phone) {
        this.sno = sno;
        this.sname = sname;
        this.sex = sex;
        this.academy = academy;
        this.grade = grade;
        this.phone = phone;
    }

    public Student() {
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", academy='" + academy + '\'' +
                ", grade=" + grade +
                ", phone=" + phone +
                '}';
    }
}
