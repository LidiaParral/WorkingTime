/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workingtime.model;

/**
 *
 * @author Lidia Parral
 */
public class ValidateData {
    
    
    public boolean validateNumTwelve(String data){       
        return data.substring(0,12).matches("[0-9]");
    }   
    public boolean validateNumNine(String data){       
        return data.substring(0,9).matches("[0-9]");
    }
    
    public boolean validatePasswd(String data){
        return data.substring(0,12).matches("[a-z][A-Z][0-9]");
    }
}
