/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Person;

/**
 *
 * @author kiara
 */
public class Enlistee extends Person{
 
    private String Enlistee;
    private static int count = 001;


    
    
    public Enlistee()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("VOL");
        sb.append(count);
        Enlistee = sb.toString();
        count++;
    }

    @Override
    public String toString() {
        return this.getName();
    }

  
    public String getEnlistee() {
        return Enlistee;
    }
    
    
   
}
