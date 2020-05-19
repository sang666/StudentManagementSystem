package Util;

import java.sql.*;

public class JdbcUtil {
    private static final String DRIVER_NAME  = "oracle.jdbc.OracleDriver";
    private static final String USERNAME  = "gllg7";
    private static final String PASSWORD  = "SANGsang666";
    private static final String URL  = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static Connection conn = null;
    private static PreparedStatement pstat = null;
    private static ResultSet rs = null;

    /*
      数据驱动程序
     */
    static {
        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static Connection getConnection(){
        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    /**
     * 通用获取PreparedStatement对象的方法
     * @param sql sql语句
     * @param os  object
     * @return ...
     */
    public static PreparedStatement createPreparedStatement(String sql,Object[]os){
        try {
            pstat = getConnection().prepareStatement(sql);
            if (os!=null){
                for(int i = 0; i <os.length ; i++) {
                    pstat.setObject(i+1,os[i]);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return pstat;

    }

    /**
     *关闭所有服务
     * @param conn ..
     * @param pstat ..
     * @param rs ..
     */
    public static void close(Connection conn, PreparedStatement pstat, ResultSet rs){
        try {
            if (rs!=null) {
                rs.close();
            }
            if (conn!=null) {
                conn.close();
            }
            if (pstat!=null) {
                pstat.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    /**
     * 通用的增删改方法
     * @param sql ..
     * @param os ..
     * @return ..
     */
    public static boolean GeneralUpdate(String sql,Object[]os){
        boolean flag = true;
        pstat = createPreparedStatement(sql, os);
        try {
            pstat.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            flag = false;
        }finally {
            close(conn,pstat,null);
        }
        return flag;
    }

    /**
     * 通用的查询方法。返回resultset结果集
     * @param sql ..
     * @param os
     * @return ..
     */
    public static ResultSet executeQuery(String sql,Object[]os){
        pstat = createPreparedStatement(sql,os);
        try {
            rs = pstat.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rs;
    }


}
