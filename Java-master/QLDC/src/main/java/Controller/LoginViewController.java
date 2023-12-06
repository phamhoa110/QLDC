/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import view.Login;
import view.Login;
/**
 *
 * @author Admin
 */
public class LoginViewController {
    public static Login login;
    
    public LoginViewController(){
        login = new Login();
    
    }
    
    public void showLoginView(){
        login.setVisible(true);
    }
}
