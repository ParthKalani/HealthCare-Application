/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Organizations;

import LifeSave.Person.PersonDirectory;
import LifeSave.Roles.Role;
import LifeSave.UserAccounts.UserAccountDirectory;
import LifeSave.WorkQueues.WorkQueue;
import java.util.ArrayList;


/**
 *
 * @author parthkalani
 */
public abstract class Organization {
    
    private String name;
    private UserAccountDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    private WorkQueue workQueue;
    private int orgId;
    private static int counter = 000;

    public Organization(String name) {
    this.name = name;
    userAccountDirectory = new UserAccountDirectory();
    personDirectory = new PersonDirectory();
    workQueue = new WorkQueue();
    counter++;
    orgId = counter;
    }
    
    public enum Type
    {
     Admin("Admin Organization"),
     Enlistee("Volunteer Organization"),
     OrganSeeker("Organ Seeker Organization"),
     AccountManager("User Accounts Organisation"),
     Sponsor("Fundings Organization"),
     Mobility("Mobility Organization"),
     HealthAuditor("Health Council Committee"),
     Surgeon("Hospital Organization");
     
     private String value;
     
     private Type(String value)
     {
         this.value = value;
     }

        public String getValue() {
            return value;
        }
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
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
    
}
