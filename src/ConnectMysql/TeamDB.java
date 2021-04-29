package ConnectMysql;

import ConnectMysql.ConnectMysql;
import ConnectMysql.ListMember;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TeamDB {
    public ListMember getMember1(String hobby)
    {
        ListMember lm=null;
        Connection conn=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        ConnectMysql connectMysql=new ConnectMysql();

        try{
            conn=connectMysql.getConnection();
            String sql="select id,name,birthday,hobby from team_member where hobby like \"%\"?\"%\"";
            preparedStatement=conn.prepareStatement(sql);
            preparedStatement.setString(1,hobby);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){

                String id=resultSet.getString("id");
                String name=resultSet.getString("name");
                String birthday=resultSet.getString("birthday");
                String hobbyEntire=resultSet.getString("hobby");
                lm=new ListMember(id,name,birthday,hobbyEntire);
            }
            else {
                System.out.println("No such team member");
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            ConnectMysql.close(preparedStatement,conn);
        }

        return lm;
    }

    public ArrayList getMember2(String hobby)
    {

        ArrayList<ListMember> arrayList=new ArrayList<>();
        Connection conn=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        ConnectMysql connectMysql=new ConnectMysql();

        try{
            conn=connectMysql.getConnection();
            String sql="select id,name,birthday,hobby from team_member where hobby like \"%\"?\"%\"";
            preparedStatement=conn.prepareStatement(sql);
            preparedStatement.setString(1,hobby);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){

                String id=resultSet.getString("id");
                String name=resultSet.getString("name");
                String birthday=resultSet.getString("birthday");
                String hobbyEntire=resultSet.getString("hobby");
                ListMember lm=new ListMember(id,name,birthday,hobbyEntire);
                arrayList.add(lm);
            }
            if (arrayList.size()==0){
                System.out.println("No such team member");
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            ConnectMysql.close(preparedStatement,conn);
        }

        return arrayList;
    }
}
