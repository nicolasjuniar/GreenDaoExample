package com.juniar.ancodev.greendaoexample.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "user")
public class User {
    //ini yang code manual
    @Id(autoincrement = true)
    Long id;
    @Property(nameInDb = "username")
    String username;
    @Property(nameInDb = "password")
    int password;
    //
    @Generated(hash = 1648596898)
    public User(Long id, String username, int password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getPassword() {
        return this.password;
    }
    public void setPassword(int password) {
        this.password = password;
    }

}
