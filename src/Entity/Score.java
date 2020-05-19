package Entity;

public class Score {
    private Integer Scno;
    private Integer Ssno;
    private Integer Sscore;

    public Score(Integer scno, Integer ssno, Integer sscore) {
        Scno = scno;
        Ssno = ssno;
        Sscore = sscore;
    }

    public Score() {
    }

    public Integer getScno() {
        return Scno;
    }

    public void setScno(Integer scno) {
        Scno = scno;
    }

    public Integer getSsno() {
        return Ssno;
    }

    public void setSsno(Integer ssno) {
        Ssno = ssno;
    }

    public Integer getSscore() {
        return Sscore;
    }

    public void setSscore(Integer sscore) {
        Sscore = sscore;
    }

    @Override
    public String toString() {
        return "Score{" +
                "Scno=" + Scno +
                ", Ssno=" + Ssno +
                ", Sscore=" + Sscore +
                '}';
    }
}
