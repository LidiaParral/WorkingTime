/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workingtime;

import workingtime.views.LoginScreen;

/**
 *
 * @author Lidia Parral
 */
public class WorkingTime {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        LoginScreen login = new LoginScreen();
        login.setVisible(true);
        Thread.sleep(500);
    }
    
}
