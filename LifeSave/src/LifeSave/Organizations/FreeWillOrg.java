/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Organizations;
import LifeSave.Roles.Role;
import LifeSave.Roles.EnlisteeRole;
import java.util.ArrayList;

/**
 *
 * @author parthkalani
 */
public class FreeWillOrg {
    
    public FreeWillOrg()
    {
        super(Organization.Type.Enlistee.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EnlisteeRole());
        return roles;
    }
    
}
