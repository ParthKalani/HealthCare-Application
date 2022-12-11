/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Organizations;

import LifeSave.Roles.Role;
import LifeSave.UserAccounts.UserAccountDirectory;
import java.util.ArrayList;
import LifeSave.Roles.Role;
import LifeSave.UserAccounts.UserAccountDirectory;
import java.util.ArrayList;


/**
 *
 * @author parthkalani
 */
public abstract class Organization {
    
    private String name;
    private UserAccountDirectory userAccountDirectory;
    private int orgId;
    private static int counter = 000;

    public Organization(String name) {
    this.name = name;
    userAccountDirectory = new UserAccountDirectory();
    counter++;
    orgId = counter;
    }
    
    public enum Type
    {
     Admin("Admin");
     
     private String value;
     
     private Type(String value)
     {
         this.value = value;
     }

        public String getValue() {
            return value;
        }
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    } 

    public String getName() {
        return name;
    }
    
     public abstract ArrayList<Role> getSupportedRole();

    public int getOrgId() {
        return orgId;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
}
