/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class User {
    private String userName;
    private String userPass;
    private int role;

    
    public User() {
    }

    public User(String userName, String userPass, int role) {
        this.userName = userName;
        this.userPass = userPass;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public int isRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    
}
