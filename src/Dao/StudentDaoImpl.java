package Dao;

import Entity.Student;
import Util.JdbcUtil;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements IStudentDao {

    @Override
    public void save(Student stu){

        String sql = "insert into student(sno,sname,sex,academy,grade,phone)values(?,?,?,?,?,?)";
        //java.util.Date ud = emp.getHiredate();
        //initialize the ud such as ud = new java.util.Date();
        //java.sql.Date sd = new java.sql.Date(ud.getTime());
        Object[]os = {
                stu.getSno(),
                stu.getSname(),
                stu.getSex(),
                stu.getAcademy(),
                stu.getGrade(),
                stu.getPhone()

        };
        JdbcUtil.GeneralUpdate(sql,os);
    }

    @Override
    public Student findByPK(Integer sno){
        String sql = "select sno,sname,sex,academy,grade,phone from student where sno=?";
        Object[]os = {sno};
        Student stu = null;
        ResultSet rs = JdbcUtil.executeQuery(sql,os);
        try {
            if (rs.next()) {
                Integer Gsno = rs.getInt("sno");
                String Gsname = rs.getString("sname");
                String Gsex = rs.getString("sex");
                String Gacademy = rs.getString("academy");
                Integer Ggrade = rs.getInt("grade");
                Integer Gphone = rs.getInt("phone");

                stu = new Student(Gsno,Gsname,Gsex,Gacademy,Ggrade,Gphone);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            stu=null;
        }
        return stu;
    }
    @Override
    public void update(Student stu, Integer sno){
        String sql = "update student set sno=?,sname=?,sex=?,academy=?,grade=?,phone=?where sno=?";
        Object[]os = {
                stu.getSno(),
                stu.getSname(),
                stu.getSex(),
                stu.getAcademy(),
                stu.getGrade(),
                stu.getPhone(),
                sno
        };
        JdbcUtil.GeneralUpdate(sql,os);
    }

    @Override
    public boolean isExistByNo(Integer sno){
        boolean isExist;
        Student stu = findByPK(sno);
        //如果stu为null则返回false，否则返回true证明有这个人
        isExist= stu != null;
        return isExist;
    }

    @Override
    public List<Student> findStudent() {
        //String sql = "select * from employee";
        String sql = "select * from student";
        Object[]os = null;
        List<Student>students = new ArrayList<>();
        try {
            ResultSet rs = JdbcUtil.executeQuery(sql,os);
            while (rs.next()) {
                Integer Ssno = rs.getInt("sno");
                String Ssname = rs.getString("sname");
                String Ssex = rs.getString("sex");
                String Sacademy = rs.getString("academy");
                Integer Sgrade = rs.getInt("grade");
                Integer Sphone =rs.getInt("phone") ;

                Student stu = new Student(Ssno,Ssname,Ssex,Sacademy,Sgrade,Sphone);
                students.add(stu);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return students;
    }

    @Override
    public void delete(Integer sno) {
        String sql ="delete from student where sno=?";
        Object[] os ={sno};
        JdbcUtil.GeneralUpdate(sql,os);
    }
}
