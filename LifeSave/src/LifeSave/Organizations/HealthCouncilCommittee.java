/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LifeSave.Organizations;
import LifeSave.Roles.HealthAuditor;
import LifeSave.Roles.Role;
import java.util.ArrayList;
/**
 *
 * @author parthkalani
 */
public class HealthCouncilCommittee {
     public HealthCouncilCommittee()
    {
        super(Organization.Type.HealthAuditor.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HealthAuditor());
        return roles;
    }
}
