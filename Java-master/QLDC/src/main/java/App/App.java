/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;
import Controller.LoginViewController;
import java.awt.EventQueue;
/**
 *
 * @author Admin
 */
public class App {
    public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginViewController loginController = new LoginViewController();
					loginController.showLoginView();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
