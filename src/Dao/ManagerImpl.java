package Dao;

import Entity.Manager;
import Entity.Student;
import Util.JdbcUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerImpl {
    public Manager findPassword(String mno){
        String sql = "select mno,mname,mpassword from manager where mno=?";
        Object[]os = {mno};
        //JdbcUtil.executeQuery(sql,os);
        Manager mag = null;
        ResultSet rs = JdbcUtil.executeQuery(sql,os);
        try {
            if (rs.next()){
                String Gmno = rs.getString("mno");
                String Gmname = rs.getString("mname");
                String Gpassword = rs.getString("mpassword");

                mag = new Manager(Gmno,Gmname,Gpassword);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            mag = null;
        }
        return mag;
    }

}
