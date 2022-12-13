/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Utilities;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author jkoti
 */
public class EmailAuthenticator extends Authenticator{
    
    public static final String SMTP_AUTH_USER = "lifesave.aed@gmail.com";                                 
    public static final String SMTP_AUTH_PWD  = "lifesave@143"; 
    @Override                                                                                                                   
    public PasswordAuthentication getPasswordAuthentication()                                             
    {                                                                                                                                      
        String username = SMTP_AUTH_USER;                                                                    
        String password = SMTP_AUTH_PWD;                                                                     
        return new PasswordAuthentication(username, password);                                             
    }  
                
}
