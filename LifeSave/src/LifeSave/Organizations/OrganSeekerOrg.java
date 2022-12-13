/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Organizations;
import LifeSave.Roles.AdminRole;
import LifeSave.Roles.OrganSeekerRole;
import LifeSave.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author parthkalani
 */
public class OrganSeekerOrg extends Organization{
    
    public OrganSeekerOrg()
    {
        super(Organization.Type.OrganSeeker.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new OrganSeekerRole());
        return roles;
    }
    
}
