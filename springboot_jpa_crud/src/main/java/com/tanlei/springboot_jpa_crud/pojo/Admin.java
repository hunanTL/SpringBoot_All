package com.tanlei.springboot_jpa_crud.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-12-27 17:28
 */
@Entity
public class Admin implements Serializable {
    private static final long serialVersionUID = -3590637844413390507L;

    //用户ID
    @Id
    @GeneratedValue
    private long id;

    //用户名
    @Column(nullable = false,unique = true)
    private String username;

    //密码
    @Column(nullable = false)
    private String password;

    //手机
    @Column(nullable = false)
    private int telphone;

    //邮箱
    @Column(nullable = false)
    private String email;

    public Admin() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTelphone() {
        return telphone;
    }

    public void setTelphone(int telphone) {
        this.telphone = telphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
