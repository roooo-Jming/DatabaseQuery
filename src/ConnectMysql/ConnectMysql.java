package ConnectMysql;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConnectMysql {

    private static String driver = null;
    private static String url = null;
    private static String user = null;
    private static String psd = null;

    public Connection getConnection() {

        String driver = null;
        String url = null;
        String user = null;
        String psd = null;
        Connection conn = null;

        Properties pro = new Properties();    //新建一个properties实例，用于从DBConfig中拿到连接参数。
        try {
            pro.load(this.getClass().getClassLoader().getResourceAsStream("DBConfig.properties")); //加载DBConfig文件。
            driver = pro.getProperty("driver");
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            psd = pro.getProperty("psd");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Class.forName(driver);   //加载jdbc驱动
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(url, user, psd);  //获取数据库连接
            conn.setAutoCommit(false);
            return conn;       //返回一个数据库连接。
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;

    }


    public static void close(Statement statement, Connection connection){
        if(statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(PreparedStatement preparedStatement, Connection connection, ResultSet result) {
        if(preparedStatement != null){
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(result != null){
            try {
                result.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
