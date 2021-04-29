package ConnectMysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListMember {
    public String id;
    public String name;
    public String birthday;
    public String hobby;

    public ListMember(String id, String name, String birthday, String hobby) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.hobby = hobby;
    }

    public ListMember()
    {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
