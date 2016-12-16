package com.bap.todo2;

import com.j256.ormlite.field.DatabaseField;

public class Users {
    @DatabaseField(canBeNull = false)
    public String userName;
    @DatabaseField(generatedId = true)
    public int userId;
    @DatabaseField(canBeNull = false)
    public String password;

    public Users(){}

    public Users(String userName, String password){
        this.password = password;
        this.userName = userName;
    }
}
