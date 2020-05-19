package Entity;

public class Manager {
    private String mno;
    private String mname;
    private String mpassword;

    public Manager(String mno, String mname, String mpassword) {
        this.mno = mno;
        this.mname = mname;
        this.mpassword = mpassword;
    }

    public Manager() {
    }

    public Manager(String mpassword) {
        this.mpassword = mpassword;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMpassword() {
        return mpassword;
    }

    public void setMpassword(String mpassword) {
        this.mpassword = mpassword;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mno='" + mno + '\'' +
                ", mname='" + mname + '\'' +
                ", mpassword='" + mpassword + '\'' +
                '}';
    }
}
