/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class UserDao {
    List<User> lu = new ArrayList<>();
    
    public UserDao(){
        lu.add(new User("hoa", "12345", 1));
        lu.add(new User("huong", "12345", 1));
        lu.add(new User("huy", "12345", 1));
        lu.add(new User("kien", "12345", 1));
        lu.add(new User("huan", "12345", 1));
       
    }
    
    public List<User> getAll(){
        return lu;
    }
    
    public int checkLogin(String username, String userpass){
        for (User user : lu) {
            if(user.getUserName().equals(username) && user.getUserPass().equals(userpass)){
                if(user.isRole() == 1){
                    return 1;
                }
                else if(user.isRole() == 0){
                    return 2;
                } else {
                    return 3;
                }
            }
        }
        return 0;
    }
}
