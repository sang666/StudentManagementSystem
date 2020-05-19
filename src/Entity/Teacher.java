package Entity;

public class Teacher {
    private Integer tno;
    private String  tname;
    private String  tpassword;
    private String  tjob;

    public Teacher(Integer tno, String tname, String tpassword, String tjob) {
        this.tno = tno;
        this.tname = tname;
        this.tpassword = tpassword;
        this.tjob = tjob;
    }

    public Teacher() {
    }

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTpassword() {
        return tpassword;
    }

    public void setTpassword(String tpassword) {
        this.tpassword = tpassword;
    }

    public String getTjob() {
        return tjob;
    }

    public void setTjob(String tjob) {
        this.tjob = tjob;
    }
}
