/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Organizations;
import LifeSave.Roles.DriverRole;
import LifeSave.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author parthkalani
 */
public class MobilityOrg {
        public MobilityOrg()
    {
        super(Organization.Type.Mobility.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DriverRole());
        return roles;
    }
}
