package com.bap.todo2;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "users")
public class Users {
    @DatabaseField(canBeNull = false)
    public String userName;
    @DatabaseField(generatedId = true)
    public int userId;
    @DatabaseField
    public String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Users() {
    }

    public Users(String userName, String password) {
        this.password = password;
        this.userName = userName;
    }

    public Users(String userName) {
        this.userName = userName;
        this.password = "asd";
    }
}
