package utils;

import java.sql.*;
import org.sqlite.JDBC;

public class sqliteHelp {
    public static Statement statement;

    public static Statement getSqliteStatement(){
        if (statement == null){
            try {
                //连接SQLite的JDBC
                Class.forName("org.sqlite.JDBC");
                Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/zhengfeng/Desktop/ServletLoginDemo/user.sqlite");
                statement = conn.createStatement();
            } catch( Exception e ) {
                e.printStackTrace ();
            }
        }
        return statement;
    }
}