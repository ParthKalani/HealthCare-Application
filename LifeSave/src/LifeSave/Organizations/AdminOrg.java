/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Organizations;


import LifeSave.Roles.AdminRole;
import LifeSave.Roles.Role;
import java.util.ArrayList;
/**
 *
 * @author parthkalani
 */
public class AdminOrg {
    public AdminOrg() {
        super(Organization.Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
    
}
