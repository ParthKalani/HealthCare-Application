/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Organizations;

import LifeSave.Roles.LifeSaveManager;
import LifeSave.Roles.Role;
import LifeSave.Roles.AccountManager;
import java.util.ArrayList;

/**
 *
 * @author parthkalani
 */
public class UserAccountsOrg extends Organization {
    
    public UserAccountsOrg()
    {
        super(Organization.Type.AccountManager.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AccountManager());
        roles.add(new LifeSaveManager());
        return roles;
    }
    
    
}
