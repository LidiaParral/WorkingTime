/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workingtime;

import workingtime.views.LoginForgotPsswd.LoginScreen;
import workingtime.views.LoginForgotPsswd.SplashScreen;

/**
 * Class WorkingTime
 * @author Lidia Parral
 * @version 1.0.0
 */
public class WorkingTime {

    /**
     * Método main: Este método permite el arranque de la aplicación.
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        SplashScreen splash = new SplashScreen();
        splash.setVisible(true);
        Thread.sleep(30000);
        splash.dispose();
        LoginScreen login = new LoginScreen();
        login.setVisible(true);
    }
    
}
