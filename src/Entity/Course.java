package Entity;

import java.sql.Date;

public class Course {
    private Integer cno;
    private String cname;
    private Integer credit;
    private Date beginDate;
    private Date endDate;
    private Integer tno;


    public Course(Integer cno, String cname, Integer credit, Date beginDate, Date endDate, Integer tno) {
        this.cno = cno;
        this.cname = cname;
        this.credit = credit;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.tno = tno;
    }

    public Course() {
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno=" + cno +
                ", cname='" + cname + '\'' +
                ", credit=" + credit +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", tno=" + tno +
                '}';
    }
}
